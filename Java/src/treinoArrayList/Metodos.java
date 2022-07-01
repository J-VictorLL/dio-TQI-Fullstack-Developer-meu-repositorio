package treinoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:
		System.out.println("Criar uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<>();
		//List<Double> notas = Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6);-> Lista fixa, imultavel
		//List<Double> notas = List.of(7d,8.5,9.3,5d,7d,0d,3.6);-> Lista fixa, imultavel
		//ArrayList<Double> notas = new ArrayList<>();
		System.out.println("Adicione as notas: ");
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(.0);
		notas.add(3.6);
		notas.add(7d);
		System.out.println(notas.toString());
		System.out.println("Exiba a posição da nota 5.0: "+notas.indexOf(5d));
		System.out.println("Adicone a nota 8 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		System.out.println("Subtitia a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6d);
		System.out.println(notas);
		System.out.println("Confira se a nota 5.0 está na lista: "+notas.contains(5d));
		System.out.println("Exiba todas as notas na ordem que forma informadas: ");
		for(double nota:notas) System.out.println(nota);
		
		System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
		System.out.println(notas.toString());
		System.out.println("Exiba a menor nota: "+ Collections.min(notas));
		System.out.println("Exiba a maior nota: "+ Collections.max(notas));
		
		System.out.print("Exiba a soma dos valores: ");
		Iterator<Double> intarator = notas.iterator();
		Double soma = 0d;
		while(intarator.hasNext()) {
			Double next = intarator.next();
			soma += next;
		}
		System.out.println(soma);
		
		System.out.print("Exiba a media dos valores: "+(soma/notas.size()));
		
		System.out.print("Romova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas.toString());
		
		System.out.print("Romova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> inte = notas.iterator();
		while(inte.hasNext()) {
			Double next = inte.next();
			if(next<7) inte.remove();
		}
		System.out.println(notas.toString());
		
		System.out.print("Apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
		System.out.print("Confira se a lista está vazia: "+notas.isEmpty());
		
		
		
	}

}
