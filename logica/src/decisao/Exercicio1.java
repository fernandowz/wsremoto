package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		char operador = JOptionPane.showInputDialog("Digite a operador").charAt(0);
		if (operador==('+')) {
			System.out.println("O resultado é:" + (valor1+valor2));
		}else if (operador=='-') {
			System.out.println("O resultado é:" + (valor1-valor2));
		}else if (operador=='*') {
			System.out.println("O resultado é:" + (valor1*valor2));
		}else if (operador=='/') {
			System.out.println("O resultado é:" + (valor1/valor2));
			
			
			}
		}
	}