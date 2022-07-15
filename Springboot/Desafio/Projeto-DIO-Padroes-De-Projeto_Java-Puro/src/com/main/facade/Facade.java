package com.main.facade;

import com.subSistema1.crm.CrmService;
import com.subSistema2.cep.CepAPI;

// implementação de facade
public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepAPI.getInstancy().recuperarCidade(cep);
		String estado = CepAPI.getInstancy().recuperarEstado(cep);
		
		
		CrmService.gravarCliente(nome, cep, estado, cidade);
	}
}
