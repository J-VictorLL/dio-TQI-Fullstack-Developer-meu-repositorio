package EstruturasDeDados;

import java.util.Stack;

public class TesteStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("Volkswagen"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());//pega o ultimo e remove
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());//pega o ultimo e não remove
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.empty());
	}

}
