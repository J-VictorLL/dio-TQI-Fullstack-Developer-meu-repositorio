package Loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar
 * a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuarío deve informa de qaul numero ele deseja 
 * ver a tabuad.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 */

public class Exercicio_5_Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero do qual se deseja a tabuada: ");
		numero = scan.nextInt();
		
		System.out.println("Tabuada de "+numero+":");
		for(int i=1;i<=10;i++) {
			System.out.println(numero+" X "+i+" = "+(numero*i));
		}
		
	}
}
