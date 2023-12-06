package br.com.vivaviatravel_spring.enums;

public enum ClassesPassagemAerea {

	ECONOMICA("Econômica"), 
	ECONOMICA_PREMIUM("Econômica Premium"), 
	EXECUTIVA("Executiva"),
	EXECUTIVA_PREMIUM("Executiva Premium"), 
	PRIMEIRA_CLASSE("Primeira Classe"),
	PRIMEIRA_CLASSE_PREMIUM("Primeira Classe Premium");

	private final String descricao;

	ClassesPassagemAerea(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
