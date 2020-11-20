package br.com.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.finalproject.dao.ArtistaDAO;
import br.com.finalproject.model.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {


	@Autowired
	private ArtistaDAO dao2;
	
	@GetMapping("/Artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao2.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	}

