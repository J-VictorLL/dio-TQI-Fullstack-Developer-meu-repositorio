package treinoArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------1
		List<Double> temperaturas = new ArrayList<>(){{
			add(30.2);
			add(28.4);
			add(26.8);
			add(32.02);
			add(35.6);
			add(33.7);
		}};
		
		Iterator<Double> intarator = temperaturas.iterator();
		Double soma = 0d;
		while(intarator.hasNext()) {
			Double next = intarator.next();
			soma += next;
		}
		Double media = soma/6;
		System.out.println("A média semestral de temperatras foi: "+media);
		Iterator<Double> intarator2 = temperaturas.iterator();
		System.out.println("As temperaturas acima da média são: ");
		while(intarator2.hasNext()) {
			Double temperatura = intarator2.next();
			if(temperatura>media) {
				System.out.print(temperatura);
				switch (temperaturas.indexOf(temperatura)) {
				case 0: 
					System.out.println(" - Janeiro");
					break;
				case 1: 
					System.out.println(" - Fevereiro");
					break;
				case 2: 
					System.out.println(" - Março");
					break;
				case 3:
					System.out.println(" - Abril");
					break;
				case 4: 
					System.out.println(" - Maio");
					break;
				case 5: 
					System.out.println(" - Junho");
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + temperaturas);
				}
			}
		}
		
		//------2
		List<Boolean> respostas = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String resposta;
		System.out.println("Responda as segintes questões com sim ou não: ");
		System.out.println("1- Telefonou para a vítima? ");
		while(true) {
			resposta = scan.next();
			if(resposta.compareToIgnoreCase("sim")==0) {
				respostas.add(true); 
				break;
			}
			else if(resposta.compareToIgnoreCase("não")==0) {
				respostas.add(false); 
				break;
			}
		}
		System.out.println("2- Esteve no local do crime? ");
		while(true) {
			resposta = scan.next();
			if(resposta.compareToIgnoreCase("sim")==0) {
				respostas.add(true); 
				break;
			}
			else if(resposta.compareToIgnoreCase("não")==0) {
				respostas.add(false); 
				break;
			}
		}
		System.out.println("3- Mora Perto da vítima? ");
		while(true) {
			resposta = scan.next();
			if(resposta.compareToIgnoreCase("sim")==0) {
				respostas.add(true); 
				break;
			}
			else if(resposta.compareToIgnoreCase("não")==0) {
				respostas.add(false); 
				break;
			}
		}
		System.out.println("4- Devia para a vítima? ");
		while(true) {
			resposta = scan.next();
			if(resposta.compareToIgnoreCase("sim")==0) {
				respostas.add(true); 
				break;
			}
			else if(resposta.compareToIgnoreCase("não")==0) {
				respostas.add(false); 
				break;
			}
		}
		System.out.println("5- Já trabalhou com a vítima? ");
		while(true) {
			resposta = scan.next();
			if(resposta.compareToIgnoreCase("sim")==0) {
				respostas.add(true); 
				break;
			}
			else if(resposta.compareToIgnoreCase("não")==0) {
				respostas.add(false); 
				break;
			}
		}
		Iterator<Boolean> intarator3 = respostas.iterator();
		int count=0;
		while(intarator3.hasNext()) {
			if(intarator3.next()) count++;
		}
		switch (count) {
		case 1:
		case 2:
			System.out.println("Pessoa suspeita!");
			break;
		case 3:
		case 4:
			System.out.println("Cumplice!");
			break;
		case 5:
			System.out.println("Assasina!");
			break;
		default:
			System.out.println("Inocente!");
		}
		
		
	}
	
	

}
