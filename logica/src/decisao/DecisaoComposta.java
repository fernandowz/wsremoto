package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("Parab�ns " + nome + " Voc� est� aprovado!");
		}else if (media<4) {
			System.out.println("Infelizmente " + nome + " voc� foi reprovado!");
		}else { //else sem condi��o pois as outras possibilidades foram preenchidas acima, ent�o j� vai para o final.
			System.out.println(nome + " voc� ainda tem uma chance no exame!");
		}
		
		System.out.println("Sua m�dia foi: " + media);
						
	} // fecha o metodo

} // fecha a classe