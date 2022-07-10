package entity;

import java.time.LocalDate;

public class Testes {

	public static void main(String[] args) {
		Cliente c = new Cliente("Sam","123456789-10",LocalDate.of(2000, 4, 15));
		
		Conta contaC = new ContasCorrente(c);
		Conta contaP = new ContasPoupança(c);
		
		contaC.imprimirExtrato();
		contaP.imprimirExtrato();
		

	}

}
