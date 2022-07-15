package com.subSistema2.cep;

public class CepAPI {

private static CepAPI cepAPI = new CepAPI();
	
	private CepAPI() {
		super();
	}
	
	public static CepAPI getInstancy() {
		return cepAPI;
	}
	
	public String recuperarCidade(String cep) {
		return "Cidade Teste";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
