package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		
	String nomeproduto = JOptionPane.showInputDialog("Nome do Produto").toUpperCase();
	short quantidade = Short.parseShort(JOptionPane.showInputDialog(" Quantidade de itens em estoque"));
	
	if (quantidade>=20 && quantidade<=40 ) {
		System.out.println("O estoque do produto" + nomeproduto + "est� normal!");
	}else if (quantidade>40 && quantidade<61) {
		System.out.println("O estoque do produto" + nomeproduto + "est� alto!");
	}else if (quantidade>60) {
		System.out.println("O estoque do produto" + nomeproduto + "est� lotado!");
	}else {
		System.out.println("O estoque do produto" + nomeproduto + "est� baixo!");

	}
		
	}
}
