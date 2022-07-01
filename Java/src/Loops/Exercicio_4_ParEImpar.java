package Loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N número inteiros,
 * calcule e mostre a quantidade de números pares
 * e impares.
 */
public class Exercicio_4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de número: ");
		int N = scan.nextInt();
		
		int quantidadePares=0, quantidadeImpares=0, numero;
		
		for(int i = 1; i<=N;i++) {
			System.out.println("Digite o npumero "+i+": ");
			numero = scan.nextInt();
			if(numero%2==0) quantidadePares++;
			else quantidadeImpares++;
		}
		
		System.out.println("A quantidade de pares foi: "+quantidadePares+"\nA quantidade de impares foi: "+quantidadeImpares);
	}
}
