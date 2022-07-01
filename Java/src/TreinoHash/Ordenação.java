package TreinoHash;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* Dadas as seguites informações sobre minhas séries favoritas,
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - rempo de episodio)
 * 
 * Série 1 =  nome: got, genero: fantasia, tempoEpisodios: 60
 * Série 2 =  nome: dark, genero: drama, tempoEpisodios: 60
 * Série 3 =  nome: that '70s show, genero: comédia, tempoEpisodios: 25
 */
public class Ordenação {
	public static void main(String[] args) {
	 
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got","fantasia",60));
			add(new Serie("dark","drama",60));
			add(new Serie("that '70s show","comédia",25));
		}};
		System.out.println("--\tOrdem de Inserção\t---");
		for (Serie serie: minhasSeries) System.out.println(serie.getNome() + 
				" - "+serie.getGenero()+" - "+serie.getTempoDeEpisodios());
		System.out.println("--\tOrdem natural (tempo de episodio)\t---");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
		System.out.println(minhasSeries2);
		System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t---");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		System.out.println(minhasSeries3);
	}
}

class Serie implements Comparable<Serie>{
	
	private String nome;
	private Integer tempoDeEpisodios;
	private String genero;
	
	public Serie(String nome, String genero,Integer tempoDeEpisodios) {
		this.nome = nome;
		this.tempoDeEpisodios = tempoDeEpisodios;
		this.genero = genero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getTempoDeEpisodios() {
		return tempoDeEpisodios;
	}
	public void setTempoDeEpisodios(Integer tempoDeEpisodiosInteger) {
		this.tempoDeEpisodios = tempoDeEpisodiosInteger;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+ " nome= " + nome + '\'' +
				", genero= "+genero+'\''+
				", tempoDeEpisodio= "+tempoDeEpisodios+'\''+'}';
				
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoDeEpisodios);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoDeEpisodios, other.tempoDeEpisodios);
	}

	@Override
	public int compareTo(Serie o) {
		// TODO Auto-generated method stub
		int nome = this.getNome().compareToIgnoreCase(o.getNome());
		int genero = this.getGenero().compareToIgnoreCase(o.getGenero());
		int tempo = Integer.compare(this.getTempoDeEpisodios(), o.getTempoDeEpisodios());
		if(tempo!=0) return tempo;
		return genero;
	}

}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie o1, Serie o2) {
		// TODO Auto-generated method stub
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
		int tempo = Integer.compare(o1.getTempoDeEpisodios(), o2.getTempoDeEpisodios());
		
		if(nome!=0)	return nome;
		if(genero!=0)	return genero;
		return tempo;
		
	}
	
}