package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor2 {

	public static void main(String[] args) {
 Professor professor = new Professor();
 Endereco endereco = new Endereco();
 professor.SetAll(
		 
		 
		 1,
		 "Pascoalli",
		 "Doutor",
		 "5555-55555",
		 endereco		 
		 );
 
 endereco.SetAll(
		 "Av. Paulista", 
		"5555", 
		 false, 
		 "Mooca", 
		 "São Paulo", 
		 "SP",
		 "101010-11111"
		 );
 	System.out.println(professor.getAll());
		 
		
	}

}
