package Loops;

import java.util.Scanner;

/*
 *Faça um programa que peça uma nota, entre 0 e 10.
 *Mostre uma menssagem caso o valor sejá invalido
 *e continui pedindo até o úsuario informa um valor valido.
 */
public class Exercicio_2_nota {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		do {
			System.out.println("Nota: ");
			nota = scan.nextInt();
			if(!((nota>=0)&&(nota<=10))) {
				System.out.println(nota+" é uma nota invalida!");
			}
		}while(!((nota>=0)&&(nota<=10)));
	}
}
