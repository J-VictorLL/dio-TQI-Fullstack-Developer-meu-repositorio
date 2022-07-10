package EstruturasDeDados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Carro> setCarros = new HashSet<>();
		
		setCarros.add(new Carro("Ford"));
		setCarros.add(new Carro("Chevrolet"));
		setCarros.add(new Carro("Fiat"));
		setCarros.add(new Carro("Volkswagen"));
		setCarros.add(new Carro("Zip"));
		setCarros.add(new Carro("Alta Romeo"));
		
		System.out.println(setCarros);
		
		//Precisa implementar o comparable na classe
		Set<Carro> treeSetCarros = new TreeSet<>();
		

		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Volkswagen"));
		treeSetCarros.add(new Carro("Zip"));
		treeSetCarros.add(new Carro("Alta Romeo"));
		
		System.out.println(treeSetCarros);
	}

}
