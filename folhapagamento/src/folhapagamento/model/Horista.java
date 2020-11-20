package folhapagamento.model;

public class Horista implements Padroes {


	private float valorHora;
	private int numeroHoras;


	public String getAll() {
		return
				"Valor Hora" + valorHora + "\n" +
				"Numero Horas" + numeroHoras + "\n";


	}
	public void setall(float valorHora, int numeroHoras) {
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	public Horista() {
		super();
	}
	public Horista(float valorHora, int numeroHoras) {
		super();
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public int getNumeroHoras() {
		return numeroHoras;
	}
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
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
