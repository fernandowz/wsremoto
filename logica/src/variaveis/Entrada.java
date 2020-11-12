package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {

		//tipo de referencia: quando o tipo de refere a uma classe.
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		//tipo primitivo: quando o tipo ja percente a linguagem (Começa com minusculo)
		//tipo primitivo precisa de um apoio. Esse apoio vem da classe "Wrappers"
			// int => integer
			// double => Double
			// boolean => Boolean
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digita a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos.");
		System.out.println("Altura: " + altura + " metros.");
		System.out.println("Peso: " + peso + " Kilos.");
		
		double imc = peso / (altura * altura);
		System.out.printf("IMC: %.2f\n",  + imc);
		System.out.printf("%s seu imc é: %.2f\n", nome, imc);
	
		
	}

}
