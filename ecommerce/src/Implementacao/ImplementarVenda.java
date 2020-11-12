package Implementacao;

import javax.swing.JOptionPane;

import beans.Cliente;
import beans.Endereco;
import beans.Produto;
import beans.Venda;
import util.Magica;

public class ImplementarVenda {
	
	public static String s(String msg) {
			return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static float f(String msg) {
		return Float.parseFloat(s( msg));
}
	public static int  i(String msg) {
		return Integer.parseInt(s( msg));
}
	
	public static void main(String[] args) {
		Venda venda = new Venda(
				Magica.f("Total"),
				Magica.s("Data"),
				new Cliente(
						Magica.i("ID"),
						Magica.s("nome"),
						Magica.s("CPF"),
						new Endereco()
						),
				new Produto(
						Magica.s("Descricao"),
						Magica.f("Venda"),
						Magica.f("Compra"),
						Magica.i("ID"),
						Magica.i("Qtde")
				)				
				);

		System.out.println(venda.getAll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
