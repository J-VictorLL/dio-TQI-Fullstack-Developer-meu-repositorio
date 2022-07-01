package treinamentoMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,  Integer> dadoResultados = new HashMap<>();
		Random rand = new Random();
		System.out.println("Lançamento de dados: ");
		Integer lancamento = 0;
		for(int i = 1; i<=100;i++) {
			lancamento = rand.nextInt(6)+1;
			dadoResultados.put(i, lancamento);
		}
		System.out.println("Resultados: ");
		System.out.println(dadoResultados);
		System.out.println("Quantidade de vezes de cada valor: ");
		Map<Integer,  Integer> quantidadePorValor = new TreeMap<>() {{
			put(1,0);
			put(2,0);
			put(3,0);
			put(4,0);
			put(5,0);
			put(6,0);
		}};
		Iterator<Integer> iterator = dadoResultados.values().iterator(); 
		while(iterator.hasNext()) {
			switch (iterator.next()){
			case 1: 
				quantidadePorValor.put(1, quantidadePorValor.get(1)+1);
				break;
			case 2: 
				quantidadePorValor.put(2, quantidadePorValor.get(2)+1);
				break;
			case 3: 
				quantidadePorValor.put(3, quantidadePorValor.get(3)+1);
				break;
			case 4: 
				quantidadePorValor.put(4, quantidadePorValor.get(4)+1);
				break;
			case 5: 
				quantidadePorValor.put(5, quantidadePorValor.get(5)+1);
				break;
			case 6: 
				quantidadePorValor.put(6, quantidadePorValor.get(6)+1);
				break;
			}
		}
		System.out.println(quantidadePorValor);
			
	}

}
