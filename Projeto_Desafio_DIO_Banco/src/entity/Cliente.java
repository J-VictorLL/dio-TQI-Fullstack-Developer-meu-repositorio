package entity;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Cliente {
	
	private String nome;
	private String CPF;
	private LocalDate nascimento;

	public Cliente(String nome, String cPF, LocalDate nascimento) {
		this.nome = nome;
		CPF = cPF;
		this.nascimento = nascimento;
	}
}
