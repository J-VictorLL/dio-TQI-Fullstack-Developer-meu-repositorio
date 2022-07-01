package Vetores;

import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros 
 * aleatórios (entre 0 e 100) armazne num vetor;
 * Ao finla mostre os números e seus sucessores.
 */
public class Atividade_3_NúmerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int[] array = new int[20];
		
		for(int i =0; i<20;i++) {
			array[i]=random.nextInt(100);
			//System.out.println(array[i]);
		}
		System.out.println("Numeros Aleatorios: ");
		for(int numero: array) {
			System.out.println(numero+" com sucessor: "+(numero+1));
		}
		
	}

}
