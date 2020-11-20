package beans;

import interfaces.padraoConta;

public class Corrente implements padraoConta{

	private float limite;
	private float taxa;

	//getall and setall
	public String getAll() {
		return
				"Limite: " + limite + "\n" +
				"Taxa: " +taxa + "\n";
	}

	public void setAll(float limite, float taxa) {
		this.limite = limite;
		this.taxa = taxa;
	}
	//construtores
	public Corrente() {
		super();
	}
	public Corrente(float limite, float taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}
	// gets and sets
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	@Override
	public boolean sacar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar() {
		// TODO Auto-generated method stub
		return false;
	}




	}



