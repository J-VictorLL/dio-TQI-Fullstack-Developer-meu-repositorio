package repository;

import entity.Conta;

public interface Opera��esBanco {

	public void transferir(double valor, Conta contaOrigem,Conta contaDestino);
	
}
