package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usuario
		 * se � alfabetizado (1) ou n�o (0)
		 * Se ele n�o for alfabetizado n�o vota.
		 * Altere o c�digo abaixo para a melhor estrutura de decisao. 
		 */
		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog(" Digite <1> para Alfabetizado"));
		String nome=JOptionPane.showInputDialog("Nome").toUpperCase();
		if (alfabetizado==1) {
		;
			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			if (idade<16) {
				System.out.println(nome + " voc� ainda n�o pode votar");
			}else if (idade>=18 && idade<=70) {

				System.out.println(nome + " voc� � obrigado(a) a votar");
			}else if (idade==16 || idade==17 || idade>70 ) {

				System.out.println(nome + " seu voto � facultativo");
			}	
		}else {
			System.out.println(nome + " voc� n�o pode votar");
		}
	}
}