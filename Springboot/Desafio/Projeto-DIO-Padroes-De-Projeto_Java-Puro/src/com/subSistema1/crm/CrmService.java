package com.subSistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}

	public static void gravarCliente(String nomeCiente, String cep, String estado, String cidade) {
		System.out.println("Clinete salvo no sistema CRM.");
		System.out.println("Nome: "+nomeCiente+", CEP: "+cep+", Cidade: "+cidade+", Estado: "+estado);
	}
}
