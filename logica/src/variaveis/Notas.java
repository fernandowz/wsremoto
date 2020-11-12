package variaveis;

import javax.swing.JOptionPane;

public class Notas {

/*
 * Solicitar um nome de aluno e duas notas, calcular a média e exibir uma mensagem 
 * para o aluno da seguinte forma:
 * "Aluno xxxxx, sua média obtida foi: xxxx para 10 faltaram: xxx pontos"
 */
	
	public static void main(String[] args) {

		String aluno = JOptionPane.showInputDialog("Digite seu nome");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segunda nota:"));
		double media = (nota1+nota2)/2;
		System.out.println("Aluno: " + aluno + ", sua média obtida foi: " + media + " para 10 faltaram: " + (10-media) + " pontos"); 

		/*
		 * tipos primitivos:
			 * boolen > Bollean > TRUE OR FALSE
			 * char > Character > 1 UNIO CARACTER ('A'), USAR COM ASPOSTROFOS 
			 * 
			 * SÃO OS INTEIROS
			 * byte > Byte (-127 / + 128)
			 * short > Short ( -32MIL / + 32MIL)
			 * int > Integer (-2BI / + 2BI)
			 * long > Long (número cientifico)
			 * 
			 * SÃO OS REAIS
			 * float > Float (para poucas casas decimais, até 5)
			 * double > Double (para muitas casas decimais)
		 */
		
	}

}
