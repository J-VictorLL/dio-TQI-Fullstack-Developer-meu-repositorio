package Loops;
/*
 * Fa�a um programa que leia 5 n�meros
 * e informe o maior n�meroe a m�dia
 * desses n�meros.
 */
import java.util.Scanner;

public class Exercicio_3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, maior=0, soma=0;
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Digite o n�mero "+i+": ");
			numero = scan.nextInt();
			if(numero>maior) {
				maior = numero;
			}
			soma +=numero;
		}
		
		System.out.println("O maior n�mero foi: "+maior);
		System.out.println("A m�dia foi: "+soma/5);
	}
}
