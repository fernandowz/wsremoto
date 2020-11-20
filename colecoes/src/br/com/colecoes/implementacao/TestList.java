package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {

	public static void main(String[] args) {


		List<String> lista = new ArrayList<String>();

		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		System.out.println("Exibindo o segundo elemento: " + lista.get(1));
		// exiba a qtde de cargos que possuem mais que 8 caracteres.
		int totalDba=0;
		int qtdeCargosTeste=0;
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Elemento " + contador + " :" + lista.get(contador));
			if (lista.get(contador).equals("DBA")) {
				totalDba++;
			}
			if (lista.get(contador).length()>8 ) {
				qtdeCargosTeste++;
			}

		}

		System.out.println("Total de DBA " + totalDba);
		System.out.println(qtdeCargosTeste + "Cargos possuem mais que 8 caracteres");
		Collections.sort(lista);
		System.out.println("Lista ordenada: " + lista); 

	}

}
