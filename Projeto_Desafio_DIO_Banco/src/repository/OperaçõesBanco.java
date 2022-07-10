package repository;

import java.util.List;

import entity.Conta;

public interface OperaçõesBanco {

	public void adicionarConta(Conta novaConta);
	
	public void listaContas();
	
	public List<Conta> selecionarConta(String titular);
	
	public Conta selecionarConta(int numero);
	
	public void transferir(double valor, Conta contaOrigem,Conta contaDestino);
	
}
