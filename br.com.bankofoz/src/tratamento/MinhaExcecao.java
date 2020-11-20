package tratamento;

import java.sql.SQLException;

public class MinhaExcecao {

	public static String tratar(Exception e) {
		if (e instanceof NullPointerException ) {
			return "Objeto está nulo.";
		}else if ( e instanceof NumberFormatException) {
			return "Numero invalido";
		}else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
		 return "Exceção não tratada";
		}
	}
}

	//Criando e instanciando pela classe filha
	//Corrente objeto = new Corrente();
	//CRIANDO pela classe pai e Instanciando pela classe filha
	//Conta objeto = new Corrente();




