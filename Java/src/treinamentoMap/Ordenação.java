package treinamentoMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ordenação {
	/* Dadas as seguinte informações sobre meus livros favoritos e seus autores,
	 * crie um dicionário e ordene-o:
	 * exibindo (Nome Autor - Nome Livro);
	 * 
	 * Autor = Hawking, Stephen - Livro = nome: Uma Breve História de Tempo. páginas: 256
	 * Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito. páginas: 488
	 * Autor = Harari, Yuval Noah - Livro = nome: 21 Lições Para o Sécullo 21. páginas: 432
 	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put(" Hawking, Stephen", new Livro("Uma Breve História de Tempo",256));
			put(" Duhigg, Charles", new Livro("O Poder do Hábito",488));
			put(" Harari, Yuval Noah", new Livro("21 Lições Para o Sécullo 21",432));
		}};
		System.out.println("--\tOrdem Aleatória\t---");
		for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) System.out.println(livro.getKey() + 
				" - "+livro.getValue().getNomeLivro()+" - "+livro.getValue().getPaginas());
		
		System.out.println("--\tOrdem Inserção\t---");
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {{
			put(" Hawking, Stephen", new Livro("Uma Breve História de Tempo",256));
			put(" Duhigg, Charles", new Livro("O Poder do Hábito",488));
			put(" Harari, Yuval Noah", new Livro("21 Lições Para o Sécullo 21",432));
		}};
		for (Map.Entry<String, Livro> livro: meusLivros2.entrySet()) System.out.println(livro.getKey() + 
				" - "+livro.getValue().getNomeLivro()+" - "+livro.getValue().getPaginas());
		
		System.out.println("--\tOrdem Alfabetica autores\t---");
		Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
		for (Map.Entry<String, Livro> livro: meusLivros3.entrySet()) System.out.println(livro.getKey() + 
				" - "+livro.getValue().getNomeLivro()+" - "+livro.getValue().getPaginas());
		
		System.out.println("--\tOrdem Alfabetica nome dos livros\t---");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomePagina());
		meusLivros4.addAll(meusLivros3.entrySet());
		//System.out.println(meusLivros4);
		for (Map.Entry<String, Livro> livro: meusLivros4) System.out.println(livro.getKey() + 
				" - "+livro.getValue().getNomeLivro()+" - "+livro.getValue().getPaginas());
		
	}

}

class Livro{
	private String nomeLivro;
	private int paginas;
	
	public Livro(String nomeLivro, int paginas) {
		this.nomeLivro = nomeLivro;
		this.paginas = paginas;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Livro{"+ " nome= " + nomeLivro +
				", Paginas= "+paginas+'}';
				
	}
}

class ComparatorNomePagina implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
		// TODO Auto-generated method stub
		int nome = o1.getValue().getNomeLivro().compareToIgnoreCase(o2.getValue().getNomeLivro());
		int pagina = Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());

		if(nome!=0)	return nome;
		return pagina;
		
	}
	
}