package br.com.colecoes.beans;

import java.util.List;

public class Colaborador {

	//no beans: Crie getters/setters/construtores
	//Crie uma classe TesteColaborador
	//Monte o código para armazenar os dados do colaborador e exibir em seguida.

	private String nome;
	private String cpf;
	private List<String> fone;

	
	public String getAll() {
return		
		"Nome" + nome + "\n" +
		"Cpf" + cpf + "\n" +
		"Fone" + fone + "\n";
					}
	
	public void setAll(String nome, String cpf, List<String> fone) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	
	
	public Colaborador() {
		super();
	}
	public Colaborador(String nome, String cpf, List<String> fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<String> getFone() {
		return fone;
	}
	public void setFone(List<String> fone) {
		this.fone = fone;
	}






}
