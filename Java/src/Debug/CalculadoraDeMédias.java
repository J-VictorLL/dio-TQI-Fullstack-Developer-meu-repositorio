package Debug;

import java.util.Scanner;

public class CalculadoraDeM�dias {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
		
		double media = calculaMedaiDaTurma(alunos, scan);
		
		System.out.printf("M�dia da turma %.1f", media);
	}
	
	public static double calculaMedaiDaTurma(String[] alunos, Scanner scanner) {
		double soma = 0;
		for(String aluno: alunos) {
			System.out.printf("Nota do aluno %s: ", aluno);
			int nota = scanner.nextInt();
			soma += nota;
		}
		return soma/alunos.length;
	}

}
