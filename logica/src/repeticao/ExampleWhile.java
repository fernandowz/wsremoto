package repeticao;

import javax.swing.JOptionPane;

public class ExampleWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Digie o email com @").toLowerCase();		
		}
		String nome = JOptionPane.showInputDialog("Digite seu nome").toLowerCase();
		while (nome.length()<=5 || nome.length()>10)
		{
			nome = JOptionPane.showInputDialog("Digine o nome novamente").toLowerCase();
		
		}
	
		System.out.println("nome" + nome);
		System.out.println("email" + email);


}
}
