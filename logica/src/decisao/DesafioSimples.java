package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
 /*
  * Capturar: o nome e a idade
  * Idade maior que 70, 16 ou 17 ele � facultativo.
  * Idade estiver entre 18 e 70 � obrigat�rio.
  * Idade for menor que 16 n�o pode votar.
  */
 
String nome = JOptionPane.showInputDialog("Eleitor").toUpperCase();
short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));

if (idade>=18 && idade<=70) {

	System.out.println(nome + " voc� � obrigado(a) a votar");
}	

if (idade==16 || idade==17 || idade>70 ) {

	System.out.println(nome + " seu voto � facultativo");
}	

if (idade<16) {

	System.out.println(nome + " voc� ainda n�o pode votar");
}	
		
	
	
	
	
	}

}
