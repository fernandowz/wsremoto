package br.com.formula1.modelo;

import br.com.formula1.implementacao.TesteCarro;

public class Carro {

	//Sintaxe do m�todo no Java
	// <modificador> <Tipo do Retorno> <nome do m�todo> (<Tipo do Param> <nome do Param>) {

	private String escuderia;
	private short numero;
	private String cor;
	private float velocidadeAtual;
	private float valor;
	private boolean status;

	public boolean retornarStatus() {
		return status;
	}
	
	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void brecar() {
		if (status==true) {
			velocidadeAtual=0;
		}
	}
	
	public void desacelerar(float param) {
		if (status==true && velocidadeAtual>param) {
			velocidadeAtual-=param;
		}
	}
	
	public void acelerar(float param) {
		if (status==true) {
			velocidadeAtual+=param;
		}
	}
	
	
	public String exibirTudo() {
		String variavel = "LIGADO";
		if (status==false) {
			variavel="DESLIGADO";
		}
		return
				"Escuderia........: " + escuderia + "\n" +
				"N�mero...........: " + numero + "\n" +
				"Cor..............: " + cor + "\n" +
				"Velocidade Atual.: " + velocidadeAtual + "\n" +
				"Valor............: " + valor + "\n" +
				"Status...........: " + variavel;
	}
	
	public void preencherBasico(short param1, String param2, float param3) {
		numero=param1;
		escuderia=param2.toUpperCase();
		valor=param3;
	}
	
	public float retornarPromocao() {
		return valor * (float) 0.9;
	}
	
	
	public void preencherValor(float param) {
		valor=param;
	}
	
	
	
	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "Desligado";
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}


	public short retornarNumero() {
		return numero;
	}


	public void preencherNumero(short param) {
		if (param>0) {
			numero=param;
		}
	}


	public String retornarEscuderia() {
		return escuderia;
	}


	public void preencherEscuderia(String param) {
		escuderia=param.toUpperCase();
	}














} // fecha a classe