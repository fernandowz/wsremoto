package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		professor.setId(1);
		professor.setNome("Pascoalli");
		professor.setTitulacao("DOUTOR");
		professor.setFone("1234-5678");
		professor.setEndereco(endereco);
		endereco.setLogradouro("Avenida Paulista");
		endereco.setComplemento(false);
		endereco.setNumero("3500");
		endereco.setCep("1234-555");
		endereco.setCidade("SAO PAULO");
		endereco.setBairro("Mooca");
		endereco.setUf("SP");
		System.out.println("Nome:...."  + professor.getNome());
		System.out.println("Endere�o:... " + professor.getEndereco().getBairro() + ", " + professor.getEndereco().getCidade());
		
		
		
		
		
		
		
		
		
		
	}



}
