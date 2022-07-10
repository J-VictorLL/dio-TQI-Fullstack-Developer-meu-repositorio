package repository;

public interface OperaçõesConta {
	
	public boolean sacar(double valor);
	
	public void depositar(double valor);
	
	public void imprimirExtrato();

}
