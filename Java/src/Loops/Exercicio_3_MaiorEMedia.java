package Loops;
/*
 * Faça um programa que leia 5 números
 * e informe o maior númeroe a média
 * desses números.
 */
import java.util.Scanner;

public class Exercicio_3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, maior=0, soma=0;
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Digite o número "+i+": ");
			numero = scan.nextInt();
			if(numero>maior) {
				maior = numero;
			}
			soma +=numero;
		}
		
		System.out.println("O maior número foi: "+maior);
		System.out.println("A média foi: "+soma/5);
	}
}
