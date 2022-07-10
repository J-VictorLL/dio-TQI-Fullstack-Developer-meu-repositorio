package EstruturasDeDados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "Carlo");
		aluno.put("Idades", "17");
		aluno.put("Média", "8.5");
		aluno.put("Turma", "3a");
		
		System.out.println(aluno);
		
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		
		List<Map<String, String>> alunos = new ArrayList<>();
		
		alunos.add(aluno);
		
		Map<String, String> aluno2 = new HashMap<>();
		aluno2.put("Nome", "Maria");
		aluno2.put("Idades", "18");
		aluno2.put("Média", "8.9");
		aluno2.put("Turma", "3b");
		
		alunos.add(aluno2);
		
		System.out.println(alunos);
		System.out.println(aluno.containsKey("Nome"));
	}

}
