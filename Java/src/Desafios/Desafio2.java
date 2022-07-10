package Desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){
            int entrada = input.nextInt();

            if (entrada%2==0) {
            System.out.println(0);
        } else {
            System.out.println(1);
            }
        }
	}

}
