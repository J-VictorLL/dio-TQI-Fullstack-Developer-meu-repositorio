package TreinoHash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Set<String> corresArcoiris = new HashSet<>() {{
			add("vermelha");
			add("laranja");
			add("amarela");
			add("verde");
			add("azul");
			add("azul-escuro");
			add("violeta");
		}};
		
		System.out.println("--\tOrdem de Inser��o\t---");
		for (String cor: corresArcoiris) System.out.println(cor);
		System.out.println("--\tQuantidade de cores:\t---");
		System.out.println(corresArcoiris.size());
		System.out.println("--\tOrdem alfabetica\t---");
		Set<String> corresArcoiris2 = new TreeSet<>(corresArcoiris);
		for (String cor: corresArcoiris2) System.out.println(cor);
		System.out.println("--\tOrdem inversa da informada:\t---");
		List<String> corresArcoiris3 = new ArrayList<>(corresArcoiris); 
		Collections.reverse(corresArcoiris3);
		for (String cor: corresArcoiris3) System.out.println(cor);
		System.out.println("--\tCome�am com a letra 'v':\t---");
		for (String cor: corresArcoiris) if(cor.startsWith("v")||cor.startsWith("V")) System.out.println(cor);
		System.out.println("--\tRemover cores que n�o come�am com a letra 'v':\t---");
		Iterator<String> interator = corresArcoiris.iterator();
        while (interator.hasNext()) {
        	String cor = interator.next();
        	if(!(cor.startsWith("v")||cor.startsWith("V"))) interator.remove();
        }
		for (String cor: corresArcoiris) System.out.println(cor);
		System.out.println("Apague todo o conjunto: ");
		corresArcoiris.clear();
		corresArcoiris2.clear();
		System.out.println("Confira se o conjunto est� vazio: "+corresArcoiris.isEmpty());
		System.out.println("Confira se o conjunto est� vazio: "+corresArcoiris2.isEmpty());
		*/
		Set<LinguagemFavorita> linguagemFavoritas = new HashSet<>() {{
			add(new LinguagemFavorita("Python","VSCode", 1991));
			add(new LinguagemFavorita("JavaScript","VSCode", 1995));
			add(new LinguagemFavorita("Java","Eclipse", 1995));
		}};
		System.out.println("--\tOrdem de Inser��o\t---");
		for (LinguagemFavorita linguagem: linguagemFavoritas) System.out.println(
				linguagem.getNome() + 
				" - "+linguagem.getAnoDeCria��o()+" - "+linguagem.getIde());
		
		System.out.println("--\tOrdem natural (nome)\t---");
		Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(linguagemFavoritas);
		for (LinguagemFavorita linguagem: linguagemFavoritas2) System.out.println(
				linguagem.getNome() + 
				" - "+linguagem.getAnoDeCria��o()+" - "+linguagem.getIde());
		
		System.out.println("--\tOrdem IDE\t---");
		Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new ComparatorIDE());
		linguagemFavoritas3.addAll(linguagemFavoritas2);
		for (LinguagemFavorita linguagem: linguagemFavoritas3) System.out.println(
				linguagem.getNome() + 
				" - "+linguagem.getAnoDeCria��o()+" - "+linguagem.getIde());
		
		System.out.println("--\tOrdem Ano de cria��o e Nome\t---");
		Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorAnoNome());
		linguagemFavoritas4.addAll(linguagemFavoritas);
		for (LinguagemFavorita linguagem: linguagemFavoritas4) System.out.println(
				linguagem.getNome() + 
				" - "+linguagem.getAnoDeCria��o()+" - "+linguagem.getIde());
		
		System.out.println("--\tOrdem Nome/Ano de cri��o/IDE\t---");
		Set<LinguagemFavorita> linguagemFavoritas5 = new TreeSet<>(new ComparatorNomeAnoIDE());
		linguagemFavoritas5.addAll(linguagemFavoritas);
		for (LinguagemFavorita linguagem: linguagemFavoritas5) System.out.println(
				linguagem.getNome() + 
				" - "+linguagem.getAnoDeCria��o()+" - "+linguagem.getIde());
		
	}

}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	String nome;
	String ide;
	int anoDeCria��o;
	
	public LinguagemFavorita(String nome, String ide, int anoDeCria��o) {
		this.nome = nome;
		this.ide = ide;
		this.anoDeCria��o = anoDeCria��o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public int getAnoDeCria��o() {
		return anoDeCria��o;
	}

	public void setAnoDeCria��o(int anoDeCria��o) {
		this.anoDeCria��o = anoDeCria��o;
	}

	@Override
	public int compareTo(LinguagemFavorita o) {
		// TODO Auto-generated method stub
		return this.nome.compareToIgnoreCase(o.getNome());
	}
	
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		// TODO Auto-generated method stub
		int IDE = o1.getIde().compareToIgnoreCase(o2.getIde());

		if(IDE!=0)	return IDE;
		return Integer.compare(o1.getAnoDeCria��o(),o2.getAnoDeCria��o());
		
	}
	
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		// TODO Auto-generated method stub
		int ano = Integer.compare(o1.getAnoDeCria��o(),o2.getAnoDeCria��o());

		if(ano!=0)	return ano;
		return o1.getNome().compareToIgnoreCase(o2.getNome());
		
	}
	
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		// TODO Auto-generated method stub
		int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
		int ano = Integer.compare(o1.getAnoDeCria��o(),o2.getAnoDeCria��o());
		
		if(nome!=0)	return nome;
		if(ano!=0)	return ano;
		return o1.getIde().compareToIgnoreCase(o2.getIde());
		
	}
	
}