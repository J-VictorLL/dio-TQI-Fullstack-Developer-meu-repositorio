package com.main.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.main.model.Endereço;

@FeignClient(name = "viacep", url="https://viacep.com.br/ws")
public interface ViaCepService {

	//@RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
	@GetMapping("/{cep}/json/")
	Endereço consultarCEP(@PathVariable("cep") String cep);
}
