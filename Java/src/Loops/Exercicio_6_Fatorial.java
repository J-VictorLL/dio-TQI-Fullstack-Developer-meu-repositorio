package Loops;

import java.util.Scanner;
/*
 * Fa�a um programa que calcule o fatorial de um n�mero
 * inteiro fornecido pelo usu�rio.
 */

public class Exercicio_6_Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, fatorial=1;
		
		System.out.print("Digite um n�mero: ");
		numero = scan.nextInt();
		
		while(numero>1) {
			fatorial *= numero--;
		}
		
		System.out.print("O fatorial do numero � "+fatorial);
		
		
	}

}
