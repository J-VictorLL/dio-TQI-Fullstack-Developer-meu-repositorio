package TreinoHash;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faça:
		System.out.println("Criar uma lista e adicione as sete notas: ");
		Set<Double> notas = new HashSet<>();
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
		
		//System.out.println("Exiba a posição da nota 5.0: "+notas.indexOf(5d));
		//System.out.println("Adicone a nota 8 na posição 4: ");
		//notas.add(4, 8d);
		//System.out.println(notas);
		//System.out.println("Subtitia a nota 5.0 pela nota 6.0: ");
		//notas.set(notas.indexOf(5d), 6d);
		//System.out.println(notas);
		System.out.println("Confira se a nota 5.0 está na lista: "+notas.contains(5d));
		//System.out.println("Exiba todas as notas na ordem que forma informadas: ");
		//for(double nota:notas) System.out.println(nota);
				
		//System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
		//System.out.println(notas.toString());
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
			
		System.out.println("Exiba a media dos valores: "+(soma/notas.size()));
				
		System.out.println("Romova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas.toString());
			
		System.out.print("Romova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> inte = notas.iterator();
		while(inte.hasNext()) {
			Double next = inte.next();
			if(next<7) inte.remove();
		}
		System.out.println(notas.toString());
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7.0);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(.0);
		notas2.add(3.6);
		notas2.add(7d);
		System.out.println(notas2);
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		notas2.clear();
		notas3.clear();
		System.out.println("Confira se o conjunto está vazio: "+notas.isEmpty());
		System.out.println("Confira se o conjunto está vazio: "+notas2.isEmpty());
		System.out.println("Confira se o conjunto está vazio: "+notas3.isEmpty());
		
	}

}
