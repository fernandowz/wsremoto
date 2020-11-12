package modelo;

public class Elevador {

	private int andarAtual;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private String nome;

public void prepararElevador (int pAndarMaximo, int pAndarMinimo, int pCapacidade ) {
	andarMaximo = pAndarMaximo;
	andarMinimo = pAndarMinimo;
	 capacidadePessoas = pCapacidade;
}
	
	//entrar
	public void entrar(int pQtde) {
		if ((pQtde+qtdePessoas)<=capacidadePessoas) {
			qtdePessoas+=pQtde;
		}	
	}
	//sair
	public void sair(int pQtde) {
		if ((qtdePessoas-pQtde)>=0) {
			qtdePessoas-=pQtde;
		}
	}
	//subir
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}

	//descer
	public void descer() {
		if (andarAtual>andarMinimo);
		andarAtual--;
	}
	//retornartudo
	public String retornarTudo() {
		return
				"Andar Atual........: " + andarAtual + "\n" +
				"Andar Maximo...........: " + andarMaximo + "\n" +
				"Andar Minimo......." + andarMinimo + "\n" +
				"Capacidade de Pessoas........" + capacidadePessoas + "\n" +
				"Qtd de pessoas........" + qtdePessoas + "\n +" +
				"nome......: " + nome;

	}	

}
