package Desafios;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		String cordenadas1 = scan.nextLine();
		String cordenadas2 = scan.nextLine();
		
		String[] s1 = cordenadas1.split(" ");
		String[] s2 = cordenadas2.split(" ");
		
		double[] ponto1 = new double[2];
		double[] ponto2 = new double[2];
		
        for (int i = 0; i < 2; i++)
        {
        	ponto1[i] =  Double.parseDouble(s1[i]); 
        	ponto2[i] =  Double.parseDouble(s2[i]); ;
        }
        
        double distancia = Math.pow(Math.pow(ponto2[0]-ponto1[0],2)+Math.pow(ponto2[1]-ponto1[1],2), .5);
        System.out.printf("%.4f",distancia);
        
	}

}
