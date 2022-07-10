package entity;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import repository.OperaçõesBanco;

public class Banco implements OperaçõesBanco{

	@Getter
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public void adicionarConta(Conta novaConta) {
		this.contas.add(novaConta);
		System.out.println("Adição realizada com sucesso!");
	}
	
	public void listaContas() {
		for(Conta conta: contas) System.out.println(
				String.format("Conta: %d, Titular: %s", 
						conta.numero,conta.cliente.getNome()));
	}
	
	public List<Conta> selecionarConta(String titular) {
		List<Conta> contasSelecionadas = new ArrayList();
		for(Conta conta: contas) if(conta.cliente.getNome().equalsIgnoreCase(titular)) contasSelecionadas.add(conta);
		return contasSelecionadas;
	}
	
	public Conta selecionarConta(int numero) {
		for(Conta conta: contas) if(conta.getNumero()==numero) return conta;
		return null;
	}
	
	@Override
	public void transferir(double valor, Conta contaOrigem,Conta contaDestino) {
		if(contaOrigem.sacar(valor)) {
			contaDestino.depositar(valor);
			System.out.println("Sucesso!");
		}else System.out.println("Transferência não realizada!");
	}
}
