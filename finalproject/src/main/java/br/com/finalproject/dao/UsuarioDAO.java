package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Usuario;

/*
 * DAO > Data Access Object (Pattern, colocar só as operações com DB)
 * Classes que contem os metodos que irao manipular os dados
 * Manipulação dos dados = CRUD
 * 	C >  Create (inserir dado na tabela)
 * 	R > Red (consultar dado na tabela)
 * 	U > Update (alterar um dado na tabela)
 * 	D > Delete (apagar um dado na tabela)
 * Classe CrudRepository<1°ClasseBeans,2° tipodeDadoPK>
 * 	Todas as acoes do CRUD disponiveis só com o import do CrudRepository.
 */

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);



	/*
	 * save() > Gravar/alterar
	 * findAll() > consultar
	 * deleteAll() > apagar
	 */



}
