package treinamentoMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
		 * modelo = gol - consumo = 14,4km/h
		 * modelo = uno - consumo = 15,6km/h
		 * modelo = mobi - consumo = 16,1km/h
		 * modelo = hb20 - consumo = 14,5km/h
		 * modelo = kwid - consumo = 15,6km/h
		 */
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
		Map<String, Double> carrosPopularesMap = new HashMap<>() {{
			put("gol",14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		}};
		System.out.println(carrosPopularesMap);
		
		System.out.println("Subtitua o consumo de gol por 15,2 km/h:");
		carrosPopularesMap.put("gol", 15.2);
		System.out.println(carrosPopularesMap);
		
		System.out.println("Confira se o modelo tucson está no dicionario: "+ carrosPopularesMap.containsKey("tucson"));

		System.out.println("Confira se o modelo uno está no dicionario: "+ carrosPopularesMap.containsKey("uno"));

		//System.out.println("Exiba o terceiro modelo adicionado: ");

		System.out.println("Exiba os modelos: ");
		System.out.println(carrosPopularesMap.keySet());
		
		System.out.println("Exiba os cosumos dos carros: ");
		System.out.println(carrosPopularesMap.values());
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		Double consumoMaisEficienteDouble = Collections.max(carrosPopularesMap.values());
		Set<Map.Entry<String, Double>> entries = carrosPopularesMap.entrySet();
		String modeloMaisEficiente = "";
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoMaisEficienteDouble)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("O modelo mais eficiente é: "+modeloMaisEficiente+"\nCom consumo: "+consumoMaisEficienteDouble);
			}
		}
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: ");
		Double consumoMenosEficiente = Collections.min(carrosPopularesMap.values());
		Set<Map.Entry<String, Double>> entries2 = carrosPopularesMap.entrySet();
		String modeloMenosEficiente = "";
		for(Map.Entry<String, Double> entry: entries2) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("O modelo menos eficiente é: "+modeloMenosEficiente+"\nCom consumo: "+consumoMenosEficiente);
			}
		}
		
		System.out.print("Exiba a soma dos consumos: ");
		Double soma = 0.0;
		Iterator<Double> iterator = carrosPopularesMap.values().iterator(); 
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		System.out.println("Exiba a média dos consumos deste dicionário de corros: "+(soma/carrosPopularesMap.size()));
		
		System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
		Iterator<Double> iterator2 = carrosPopularesMap.values().iterator(); 
		while(iterator2.hasNext()) {
			if(iterator2.next().equals(15.6)) iterator2.remove();
		}
		System.out.println(carrosPopularesMap);
		
		System.out.println("Exiba os carros na ordem em que foram informados:");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
			put("gol",14.4);
			put("uno",15.6);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
		}};
		System.out.println(carrosPopulares1);
		
		System.out.println("Exiba o dicionário ordenado pelo modelo:");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		System.out.println("Apague o dicionario:");
		carrosPopularesMap.clear();
		System.out.println("Confira se o dicionario foi apagado: "+carrosPopularesMap.isEmpty());
	}

}
