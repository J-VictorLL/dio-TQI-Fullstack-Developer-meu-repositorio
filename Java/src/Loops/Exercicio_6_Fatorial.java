package Loops;

import java.util.Scanner;
/*
 * Faça um programa que calcule o fatorial de um número
 * inteiro fornecido pelo usuário.
 */

public class Exercicio_6_Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, fatorial=1;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		while(numero>1) {
			fatorial *= numero--;
		}
		
		System.out.print("O fatorial do numero é "+fatorial);
		
		
	}

}
