package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerZeroStockException extends Exception {

    public BeerZeroStockException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed have empty stock capacity: %s", id, quantityToDecrement));
    }
}
