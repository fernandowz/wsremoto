package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.beans.Aluno;

public class ImplementarAluno3 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome:         "),
				JOptionPane.showInputDialog("E-mail:          ")
				);
				System.out.println(aluno.getAll());
					
		
		
		
		
		
		
		
		
	}

}
