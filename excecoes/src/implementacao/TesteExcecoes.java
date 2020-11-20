package implementacao;

import tratamento.MinhaExcecao;

/*
 * Dois tipos de Execoes:
 * Checked (AC) => excecoes que ocorrem antes da compilacao. Normalmente voltadas para acesso a recursos externos (ex: DB, arquivos)
 * Unchecked (DC) => excecoes que sao disparadas somente apos a compilacao. (Exemplo NullPointer, NumberFormat)
 */

public class TesteExcecoes {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("7");
			System.out.println(numero);

			String nome = "";
			System.out.println("Qtde de letras: " + nome.length());

			double vetor[] = new double[2];
			vetor[0] = 5.54;
			vetor[1]= 6.12;
			vetor[2]=15.8;


		} catch (Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally { 
			System.out.println("Até logo");
		}

	}
}
