package folhapagamento.model;

public abstract class Funcionario implements Padroes{
	
	protected String nome;
	protected  int numeroRegistro;

	
	public abstract float calcularSalario());
	public String getAll() {
		return
				"Nome: " + nome + "\n" +
				"Registro" + numeroRegistro + "\n";
	}
	public void setAll(String nome, int numeroRegistro) {
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
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
