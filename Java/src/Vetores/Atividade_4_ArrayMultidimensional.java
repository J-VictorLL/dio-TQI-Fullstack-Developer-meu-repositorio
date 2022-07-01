package Vetores;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores 
 * aleatórios entre 0 e 9.
 */
public class Atividade_4_ArrayMultidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[][] M = new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4;j++) {
				M[i][j]=random.nextInt(9);
			}
		}
		System.out.println("-----------");
		for(int i=0; i<4; i++) {
			System.out.print("| ");
			for(int j=0; j<4;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println("|");
		}
		System.out.println("-----------");
	}

}
