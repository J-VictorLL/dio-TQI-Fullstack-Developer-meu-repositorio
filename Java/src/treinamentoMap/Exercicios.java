package treinamentoMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dicionario estado-população:");
		Map<String,  Integer> estadosPopulacao = new HashMap<>() {{
			put("PE",9616621);
			put("AL",3351543);
			put("CE",9187103);
			put("RN",3534265);
		}};
		System.out.println(estadosPopulacao);
		
		estadosPopulacao.put("RN", 3534165);
		System.out.println(estadosPopulacao);
		
		if(!estadosPopulacao.containsKey("PB")) estadosPopulacao.put("PB", 4039277);
		System.out.println(estadosPopulacao);
		
		System.out.println(estadosPopulacao.get("PE"));
		
		System.out.println("Ordem Informado:");
		Map<String,  Integer> estadosPopulacao2 = new LinkedHashMap<>() {{
			put("PE",9616621);
			put("AL",3351543);
			put("CE",9187103);
			put("RN",3534265);
		}};
		System.out.println(estadosPopulacao2);
		System.out.println("Ordem Alfabetica:");
		Map<String,  Integer> estadosPopulacao3 = new TreeMap<>(estadosPopulacao2);
		System.out.println(estadosPopulacao3);
		
		System.out.println("Estado com menor população:");
		Integer menor = Collections.min(estadosPopulacao.values());
		Set<Map.Entry<String, Integer>> entries = estadosPopulacao.entrySet();
		String estadoComMenorPopulacao = "";
		for(Map.Entry<String, Integer> entry: entries) {
			if(entry.getValue().equals(menor)) {
				estadoComMenorPopulacao = entry.getKey();
				System.out.println("O modelo mais eficiente é: "+estadoComMenorPopulacao+"\nCom consumo: "+menor);
			}
		}
		
		System.out.println("Estado com menor população:");
		Integer maior = Collections.max(estadosPopulacao.values());
		String estadoComMaiorPopulacao = "";
		for(Map.Entry<String, Integer> entry: entries) {
			if(entry.getValue().equals(maior)) {
				estadoComMenorPopulacao = entry.getKey();
				System.out.println("O modelo mais eficiente é: "+estadoComMaiorPopulacao+"\nCom consumo: "+maior);
			}
		}
		
		System.out.print("Soma das populações: ");
		Integer soma = 0;
		Iterator<Integer> iterator = estadosPopulacao.values().iterator(); 
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		System.out.println("Média das populaçoes: "+(soma/estadosPopulacao.size()));
		
		Iterator<Integer> iterator2 = estadosPopulacao.values().iterator(); 
		while(iterator2.hasNext()) {
			if(iterator2.next()>4000000) iterator2.remove();
		}
		System.out.println("Apague o dicionario:");
		estadosPopulacao.clear();
		System.out.println("Confira se o dicionario foi apagado: "+estadosPopulacao.isEmpty());
		
		
	}

}
