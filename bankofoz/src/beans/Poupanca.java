package beans;

import interfaces.padraoConta;

public class Poupanca extends conta{

	private float rendimento;


	public String getAll() {
		return
				"Rendimento" + rendimento + "\n";
	}

	public void setAll(float rendimento) {
		this.rendimento = rendimento;
	}

	//Construtor

	public Poupanca() {
		super();
	}

	public Poupanca(float rendimento) {
		super();
		this.rendimento = rendimento;
	}

	// gets and sets
	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
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


	//


	}



























