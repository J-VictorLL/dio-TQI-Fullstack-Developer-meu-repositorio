package metodos;

public class Emprestimo {

	public static double getTaxaParcelas(int parcelas) {
		double taxa = 0.3;
		for(int i = 2; i<parcelas;i++) {
			taxa *=1.5;
		}
		return taxa;
	}
	
	public static void calcular(double valor, int parcelas) {

		double valorFinal = valor + (valor*getTaxaParcelas(parcelas));
		System.out.println("O valor final do emprestimo foi de: "+valorFinal);
	}
	
}
