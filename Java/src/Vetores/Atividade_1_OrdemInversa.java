package Vetores;
/*
 * Criar um vetor de 6 números inteiros e
 * mostre-os na ordem inversa.
 */
public class Atividade_1_OrdemInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,21,-3,84,25,36};
		
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
