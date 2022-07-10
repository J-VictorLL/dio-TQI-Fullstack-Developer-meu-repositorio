package Desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			 
	        int N= scan.nextInt();
	        scan.nextLine();
	        //System.out.println(N);
	        String string = "";
            for (int i = 0; i < N; i++)
            {
            string += scan.nextLine()+" ";
            }
	    
	        System.out.println(string);
	    
	    //quebra string em várias substrings a partir de um caracter
	        String[] s = string.split(" ");
	
	        int[] idade = new int[N];
	
	        for (int i = 0; i < N; i++)
	        {
	            idade[i] =  Integer.parseInt(s[i])      ;
	        }
	
	
	        System.out.println("Nao poderao entrar as idades: ");
	        for (int i = 0; i < N; i++)
	        {
	            if (idade[i]<18)
	            {
	                System.out.println(idade[i]);
	            }
	
	        }
	}

}