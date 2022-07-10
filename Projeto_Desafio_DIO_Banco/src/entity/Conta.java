package entity;
import lombok.Getter;
import repository.OperaçõesConta;

@Getter
public abstract class Conta implements OperaçõesConta{
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String tipo;
	protected Cliente cliente;
	
	public Conta(String tipo, Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.tipo = tipo;
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(double valor) {
		if(this.saldo<valor) {
			System.out.println("Erro! Saldo insufiviente!");
			return false;
		}
		this.saldo -= valor;
		System.out.println("Sucesso!\nNovo Saldo: "+this.saldo);
		return true;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Sucesso!\nNovo Saldo: "+this.saldo);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("-----  Extrato Conta %s -----", this.tipo));
		System.out.println(String.format("Titula: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	

}
