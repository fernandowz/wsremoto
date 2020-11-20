package Implementacao;

import javax.swing.JOptionPane;

import beans.Cd;
import beans.Livro;
import beans.Produto;
import util.Magica;
import util.PadraoProduto;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto objeto = new Produto();

		do {
		char opcao = Magica.s("Digite L para Livro ou C para CD").charAt(0);
		if (opcao== 'L') {
			objeto = new Livro(
					Magica.s("Descrição: "),
					Magica.f("Valor de Venda: "),
					Magica.f("Valor de Compra: "),
					Magica.i("Código: "),
					Magica.i("Qtde: "),
					Magica.s("ISBN: "),
					Magica.s("Autor"),
					Magica.s("Editoria: ")
					);

		}else {
			objeto = new Cd(
					Magica.s("Descrição: "),
					Magica.f("Valor de Venda: "),
					Magica.f("Valor de Compra: "),
					Magica.i("Código: "),
					Magica.i("Qtde: "),
					Magica.s("Artista: "),
					Magica.i("Total Faixas: "),
					Magica.b("É lançamento?")
					);
		}
		// System.out.println(objeto.getAll());
		JOptionPane.showMessageDialog(null,objeto.getAll());
		JOptionPane.showMessageDialog(null, objeto.retornarImposto());

		}while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta",JOptionPane.YES_NO_OPTION)==0); // (0=yes)
	}

}
