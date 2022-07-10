package EstruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Volkswagen"));
		
		System.out.println(queueCarros);
		//erro se der false
		System.out.println(queueCarros.add(new Carro("Peugeot")));
		System.out.println(queueCarros);
		//so da false se não retornar
		System.out.println(queueCarros.offer(new Carro("Renoult")));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());//pega o primeiro elemento sem remove-lo
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.poll());//pega o primeiro elemento e remove-o
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.isEmpty());
		System.out.println(queueCarros.size());
	}

}
