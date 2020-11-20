package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;
import util.Magica;

public class TesteListObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();

		//1° forma de adicionar
		lista.add(new Cargo(
				Magica.s("Cargo"),
				Magica.s("Nivel"),
				Magica.f("Salario")
				));

		// 2° forma de adicionar
		Cargo objeto = new Cargo();
		objeto.setNivel(Magica.s("Nivel"));
		objeto.setNome(Magica.s("Nome"));
		objeto.setSalario(Magica.f("Salario"));
		lista.add(objeto);
		// fim da segunda forma.
		System.out.println("Nome do primeiro cargo: " + lista.get(0).getNome());
		//INCLUAM:
		//QTS JR FORAM ARMAZENADOS
		//MEDIAD ENTRE TODOS OS SALARIOS

		int Qtdej =0;
		float totalSalarios=0;

		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo numero: " + (cont+1));
			System.out.println("Nome do Cargo" + lista.get(cont).getNome());
			System.out.println("Nivel do Cargo" + lista.get(cont).getNivel());
			System.out.println("Salario do Cargo" + lista.get(cont).getSalario());
			totalSalarios+=lista.get(cont).getSalario();
			if (lista.get(cont)).getNivel().equals("JR")) { qtdej++;
			}
		
		}

		System.out.println("Media de salarios" + (totalSalaros/lista.size()));
		System.out.println(Qtde JR's" + qtdej);
	}

}
