package br.com.finalproject.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.finalproject.model.Artista;
import br.com.finalproject.model.Usuario;

public interface ArtistaDAO extends CrudRepository<Artista,Integer>{

	public Usuario findByNomeArtisticoAndNacionalidade(String Artista, String Nacionalidade);
	
}
