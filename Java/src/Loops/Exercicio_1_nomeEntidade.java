package Loops;

import java.util.Scanner;

/*
 Faça um programa que lei um conjunto de dois valores
 o primeiro recebendo o nome do aluno e o segundo
 representando a sua idade.
 (Pare o programa inserindo o valor 0 no campo nome)
 */
public class Exercicio_1_nomeEntidade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		do {
			System.out.println("Nome: ");
			nome = scan.next();
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}while(!nome.equals("0"));
	}
}
