package treinoStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Metodos {

	public static void main(String[] args) {
		List<String> numerosAleatorios = Arrays.asList(
				"1","0","4","1","2","3","9","9","6","5","15");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		/*numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});*/
		//numerosAleatorios.stream().forEach(t -> System.out.println(t));
		numerosAleatorios.stream().forEach(System.out::println);
		
		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
		//Set<String> set = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet())
							.forEach(System.out::println);
		
		System.out.println("Transforme a lista em outra, só que de inteiros: ");
		/*numerosAleatorios.stream().map(
					new Function<String, Integer>() {

						@Override
						public Integer apply(String t) {
							return Integer.parseInt(t);
						}
					}
				);
				*/
		//numerosAleatorios.stream().map(t-> Integer.parseInt(t));
		//numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList())
		//						.forEach(System.out::println);
		//List<Integer> collectList = numerosAleatorios.stream()
			//	.map(Integer::parseInt).collect(Collectors.toList());
									
		System.out.println("Pegue os npumeros pares e maiores que 2 e coloque em uma lista: ");
		/*numerosAleatorios.stream().map(Integer::parseInt)
			.filter(new Predicate<Integer>() {

				@Override
				public boolean test(Integer t) {
					if((t%2==0) && (t>2)) return true;
					return false;
				}
				
			}).collect(Collectors.toList()).forEach(System.out::println);
		*/
		numerosAleatorios.stream().map(Integer::parseInt).filter(t->(t%2==0) && (t>2))
				.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Mostre a média dos números: ");
		/*numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {

			@Override
			public int applyAsInt(String value) {
				return Integer.parseInt(value);
			}
			
		});*/
		//numerosAleatorios.stream().mapToInt(value -> Integer.parseInt(value));
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average()
		.ifPresent(System.out::println);
		
		System.out.println("Remova os valores impares: ");
		List<Integer> numerosAleatoriosInteros = numerosAleatorios.stream()
				.map(Integer::parseInt).collect(Collectors.toList());
		//numerosAleatorios.stream().map(Integer::parseInt).filter(t->(t%2!=0))
			//	.collect(Collectors.toList()).forEach(System.out::println);
		/*numerosAleatoriosInteros.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if(t%2!=0) return true;
				return false;
			}
		});*/
		numerosAleatoriosInteros.removeIf(t -> (t%2!=0));
		System.out.println(numerosAleatoriosInteros);
		
		System.out.println("Ignore os tres primeiros elementos da lista: ");
		IntStream.range(3, numerosAleatorios.size()).mapToObj(i->numerosAleatorios.get(i))
				.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Retirado os números repetidos da lista, quantos numeros ficam? ");
		System.out.println(numerosAleatorios.stream().collect(Collectors.toSet()).size());
		
		System.out.println("Mostre o menor valor da lista: ");
		numerosAleatorios.stream().mapToInt(Integer::parseInt).min()
		.ifPresent(System.out::println);
		
		System.out.println("Mostre o maior valor da lista: ");
		numerosAleatorios.stream().mapToInt(Integer::parseInt).max()
		.ifPresent(System.out::println);
		
		System.out.println("Pegue apenas os números impares e some: ");
		System.out.println(numerosAleatorios.stream()
				.mapToInt(Integer::parseInt)
					.filter(t->(t%2!=0)).sum());
		
		System.out.println("Mostre os itens na ordem numerica: ");
		numerosAleatorios.stream().map(Integer::parseInt).sorted()
		.forEach(System.out::println);
		
		System.out.println("Agrupe os valores impares multiplos de 3 e de 5: ");
		System.out.println(numerosAleatorios.stream().map(Integer::parseInt).filter(t->(t%2!=0))
		.collect(Collectors.groupingBy(t->(t%3==0)&&(t%5==0))));
	
	}
}
