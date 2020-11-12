package br.com.unixyz.implementacao;

import java.io.ObjectInputStream.GetField;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		Professor professor = new Professor(

				1,
				"Paschalli",
				"Doutor",
				"5555-555",
				new Endereco(
						"Avenida Paulista",
						"555",
						false,
						"Mooca",
						"Sao Paulo",
						"SP",
						"113313-13313"					
						)
				);
System.out.println(professor.getAll());

	}

}
