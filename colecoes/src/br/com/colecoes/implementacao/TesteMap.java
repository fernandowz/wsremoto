package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class TesteMap {

	public static void main(String[] args) {
		Map<Integer,String> lista = new HashMap<Integer,String>();
		lista.put(5505,  "DBA");
		lista.put(5506,  "DBA");
		lista.put(5530,  "ANALISTA");
		lista.put(5599,  "ESTAGIARIO");
		System.out.println(lista);
		System.out.println("chaves" + lista.keySet());
		System.out.println("valores" + lista.values());
		
		
		
	}

}
