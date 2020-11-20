package folhapagamento.model;

public class Empreiteiro implements Padroes{

	private float valorEmpreita;


	public String getAll() {
		return
				"Valor Empreita" + valorEmpreita + "\n";

	}

	public void setAll(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	public Empreiteiro() {
		super();
	}

	public Empreiteiro(float valorEmpreita) {
		super();
		this.valorEmpreita = valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}

	@Override
	public float salarioBase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
