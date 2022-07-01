package Vetores;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas cossoantes forma lidas.
 * Imprima as cossoantes
 */
public class Atividade_2_Cosoantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cosoantes = new String[6];
		String letra;
		int quantidadeCosoantes = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite a letra "+(i+1)+": ");
			letra = scan.next();
			if(!(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
					letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||
					letra.equalsIgnoreCase("u"))) {
				quantidadeCosoantes++;
				cosoantes[i]=letra;
			}
		}
		System.out.println("Quantidade de conssoantes: "+quantidadeCosoantes);
		for(String cosoante: cosoantes) {
			if(cosoante!=null) System.out.println(cosoante);
		}
	}

}
