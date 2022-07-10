package repository;

import entity.Conta;

public interface OperaçõesBanco {

	public void transferir(double valor, Conta contaOrigem,Conta contaDestino);
	
}
