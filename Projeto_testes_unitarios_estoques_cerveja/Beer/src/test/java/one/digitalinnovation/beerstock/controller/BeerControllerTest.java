package one.digitalinnovation.beerstock.controller;

import static one.digitalinnovation.beerstock.utils.JsonConvertionUtils.asJsonString;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import one.digitalinnovation.beerstock.builder.BeerDTOBuilder;
import one.digitalinnovation.beerstock.dto.BeerDTO;
import one.digitalinnovation.beerstock.dto.QuantityDTO;
import one.digitalinnovation.beerstock.exception.BeerNotFoundException;
import one.digitalinnovation.beerstock.exception.BeerStockExceededException;
import one.digitalinnovation.beerstock.service.BeerService;

@ExtendWith(MockitoExtension.class)
public class BeerControllerTest {

    private static final String BEER_API_URL_PATH = "/api/v1/beers";
    private static final long VALID_BEER_ID = 1L;
    private static final long INVALID_BEER_ID = 2l;
    private static final String BEER_API_SUBPATH_INCREMENT_URL = "/increment";
    @SuppressWarnings("unused")
	private static final String BEER_API_SUBPATH_DECREMENT_URL = "/decrement";

    private MockMvc mockMvc;

    @Mock
    private BeerService beerService;

    @InjectMocks
    private BeerController beerController;

    @BeforeEach //Cria um mock do beerControler antes da cada teste
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(beerController)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .setViewResolvers((s, locale) -> new MappingJackson2JsonView())
                .build();
    }

    @Test //Testa se a chamada de um comando POST cria uma Beer
    void whenPOSTIsCalledThenABeerIsCreated() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();

        //condições when
        when(beerService.createBeer(beerDTO)).thenReturn(beerDTO);

        // then -> realiza o POST e verifica se os dados do mock forma guardados
        mockMvc.perform(post(BEER_API_URL_PATH)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(beerDTO)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name", is(beerDTO.getName())))
                .andExpect(jsonPath("$.brand", is(beerDTO.getBrand())))
                .andExpect(jsonPath("$.type", is(beerDTO.getType().toString())));
    }

    @Test //Testa se a chamada de um comando POST sem alguns campos requeridos retorna um erro
    void whenPOSTIsCalledWithoutRequiredFieldThenAnErrorIsReturned() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();
        beerDTO.setBrand(null);

        // then -> realiza o POST e verifica se o erro foi lançado
        mockMvc.perform(post(BEER_API_URL_PATH)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(beerDTO)))
                .andExpect(status().isBadRequest());
    }

    @Test //Testa se a chamada de um comando GET com nome valido, o status OK é retornado
    void whenGETIsCalledWithValidNameThenOkStatusIsReturned() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();

        //condição when
        when(beerService.findByName(beerDTO.getName())).thenReturn(beerDTO);

        // then -> realiza o GET e verifica se o status OK foi lançado
        mockMvc.perform(MockMvcRequestBuilders.get(BEER_API_URL_PATH + "/" + beerDTO.getName())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(beerDTO.getName())))
                .andExpect(jsonPath("$.brand", is(beerDTO.getBrand())))
                .andExpect(jsonPath("$.type", is(beerDTO.getType().toString())));
    }

    @Test //Testa se a chamada de um comando GET com nome invalido, o status NOT FOUND é retornado
    void whenGETIsCalledWithoutRegisteredNameThenNotFoundStatusIsReturned() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();

        //condição when
        when(beerService.findByName(beerDTO.getName())).thenThrow(BeerNotFoundException.class);

        // then -> realiza o GET e verifica se o status NOT FOUND foi lançado
        mockMvc.perform(MockMvcRequestBuilders.get(BEER_API_URL_PATH + "/" + beerDTO.getName())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test //Testa se a chamada de um comando GET para uma lista retorna o status OK
    void whenGETListWithBeersIsCalledThenOkStatusIsReturned() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();

        //condição when
        when(beerService.listAll()).thenReturn(Collections.singletonList(beerDTO));

        // then -> realiza o GET e verifica se o status OK foi lançado e os valores estão corretos
        mockMvc.perform(MockMvcRequestBuilders.get(BEER_API_URL_PATH)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name", is(beerDTO.getName())))
                .andExpect(jsonPath("$[0].brand", is(beerDTO.getBrand())))
                .andExpect(jsonPath("$[0].type", is(beerDTO.getType().toString())));
    }

    @Test //Mesmo teste que o acima, mas caso nenhuma cerveja tenha sido adicionada
    void whenGETListWithoutBeersIsCalledThenOkStatusIsReturned() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();

        //condição when
        when(beerService.listAll()).thenReturn(Collections.singletonList(beerDTO));

        // then -> realiza o GET e verifica se o status OK foi lançado
        mockMvc.perform(MockMvcRequestBuilders.get(BEER_API_URL_PATH)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test //Testa se a chamada de um comando DELETE com ID valido, o status NO CONTENT é retornado
    void whenDELETEIsCalledWithValidIdThenNoContentStatusIsReturned() throws Exception {
    	//Criação de instância teste
        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();

        //condição when
        doNothing().when(beerService).deleteById(beerDTO.getId());

        // then -> realiza o DELETE e verifica se o status NO CONTENT foi retornado
        mockMvc.perform(MockMvcRequestBuilders.delete(BEER_API_URL_PATH + "/" + beerDTO.getId())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }

    @Test //Testa se a chamada de um comando DELETE com ID invalido, o status NOT FOUND é retornado
    void whenDELETEIsCalledWithInvalidIdThenNotFoundStatusIsReturned() throws Exception {
    	//condição when
        doThrow(BeerNotFoundException.class).when(beerService).deleteById(INVALID_BEER_ID);

        // then -> realiza o DELETE e verifica se o status NOT FOUND foi retornado
        mockMvc.perform(MockMvcRequestBuilders.delete(BEER_API_URL_PATH + "/" + INVALID_BEER_ID)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test //Testa se a chamada de um comando PATCH com ID valido, o status OK é retornado
    void whenPATCHIsCalledToIncrementDiscountThenOKstatusIsReturned() throws Exception {
    	//Criação de instância teste
        QuantityDTO quantityDTO = QuantityDTO.builder()
                .quantity(10)
                .build();

        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();
        beerDTO.setQuantity(beerDTO.getQuantity() + quantityDTO.getQuantity());
        //condição when
        when(beerService.increment(VALID_BEER_ID, quantityDTO.getQuantity())).thenReturn(beerDTO);

        // then -> realiza o PATCH e verifica se o status OK foi retornado
        mockMvc.perform(MockMvcRequestBuilders.patch(BEER_API_URL_PATH + "/" + VALID_BEER_ID + BEER_API_SUBPATH_INCREMENT_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(quantityDTO))).andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(beerDTO.getName())))
                .andExpect(jsonPath("$.brand", is(beerDTO.getBrand())))
                .andExpect(jsonPath("$.type", is(beerDTO.getType().toString())))
                .andExpect(jsonPath("$.quantity", is(beerDTO.getQuantity())));
    }

    @Test //Testa se a chamada de um comando PATCH para incremento acima do limite retorna BAD RESQUEST 
    void whenPATCHIsCalledToIncrementGreatherThanMaxThenBadRequestStatusIsReturned() throws Exception {
    	//Criação de instância teste
    	QuantityDTO quantityDTO = QuantityDTO.builder()
                .quantity(30)
                .build();

        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();
        beerDTO.setQuantity(beerDTO.getQuantity() + quantityDTO.getQuantity());
        //condição when
        when(beerService.increment(VALID_BEER_ID, quantityDTO.getQuantity())).thenThrow(BeerStockExceededException.class);

        // then -> realiza o PATCH e verifica se o status BAD REQUEST foi retornado
        mockMvc.perform(patch(BEER_API_URL_PATH + "/" + VALID_BEER_ID + BEER_API_SUBPATH_INCREMENT_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(quantityDTO))).andExpect(status().isBadRequest());
    }

    @Test //Testa se a chamada de um comando PATCH com ID invalido, o status NOT FOUND é retornado
    void whenPATCHIsCalledWithInvalidBeerIdToIncrementThenNotFoundStatusIsReturned() throws Exception {
    	//Criação de instância teste
    	QuantityDTO quantityDTO = QuantityDTO.builder()
                .quantity(30)
                .build();
    	//condição when
        when(beerService.increment(INVALID_BEER_ID, quantityDTO.getQuantity())).thenThrow(BeerNotFoundException.class);
        
        // then -> realiza o PATCH e verifica se o status NOT FOUND foi retornado
        mockMvc.perform(patch(BEER_API_URL_PATH + "/" + INVALID_BEER_ID + BEER_API_SUBPATH_INCREMENT_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(quantityDTO)))
                .andExpect(status().isNotFound());
    }

    @Test //Testa se a chamada de um comando PATCH para realizar decremento, o status OK é retornado
    void whenPATCHIsCalledToDecrementDiscountThenOKstatusIsReturned() throws Exception {
    	//Criação de instância teste
    	QuantityDTO quantityDTO = QuantityDTO.builder()
                .quantity(5)
                .build();

        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();
        beerDTO.setQuantity(beerDTO.getQuantity() + quantityDTO.getQuantity());
    	//condição when
        when(beerService.decrement(VALID_BEER_ID, quantityDTO.getQuantity())).thenReturn(beerDTO);

        // then -> realiza o PATCH e verifica se o status OK foi retornado
        mockMvc.perform(patch(BEER_API_URL_PATH + "/" + VALID_BEER_ID + BEER_API_SUBPATH_DECREMENT_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(quantityDTO))).andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(beerDTO.getName())))
                .andExpect(jsonPath("$.brand", is(beerDTO.getBrand())))
                .andExpect(jsonPath("$.type", is(beerDTO.getType().toString())))
                .andExpect(jsonPath("$.quantity", is(beerDTO.getQuantity())));
    }

    @Test //Testa se a chamada de um comando PATCH para realizar decremento abaixo de stock 0, o status BAD REQUEST é retornado
    void whenPATCHIsCalledToDEcrementLowerThanZeroThenBadRequestStatusIsReturned() throws Exception {
 		//Criação de instância teste
        QuantityDTO quantityDTO = QuantityDTO.builder()
                .quantity(60)
                .build();

        BeerDTO beerDTO = BeerDTOBuilder.builder().build().toBeerDTO();
        beerDTO.setQuantity(beerDTO.getQuantity() + quantityDTO.getQuantity());
    	//condição when
        when(beerService.decrement(VALID_BEER_ID, quantityDTO.getQuantity())).thenThrow(BeerStockExceededException.class);

        // then -> realiza o PATCH e verifica se o status BAD REQUEST foi retornado
        mockMvc.perform(patch(BEER_API_URL_PATH + "/" + VALID_BEER_ID + BEER_API_SUBPATH_DECREMENT_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(quantityDTO))).andExpect(status().isBadRequest());
    }

    @Test //Testa se a chamada de um comando PATCH chamado com id invalido, o status NOT FOUND é retornado
    void whenPATCHIsCalledWithInvalidBeerIdToDecrementThenNotFoundStatusIsReturned() throws Exception {
	    //Criação de instância teste
        QuantityDTO quantityDTO = QuantityDTO.builder()
                .quantity(5)
                .build();
    	//condição when
        when(beerService.decrement(INVALID_BEER_ID, quantityDTO.getQuantity())).thenThrow(BeerNotFoundException.class);
        
        // then -> realiza o PATCH e verifica se o status NOT FOUND foi retornado
        mockMvc.perform(patch(BEER_API_URL_PATH + "/" + INVALID_BEER_ID + BEER_API_SUBPATH_DECREMENT_URL)
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(quantityDTO)))
                .andExpect(status().isNotFound());
    }
}
