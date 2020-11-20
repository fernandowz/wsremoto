package folhapagamento.model;

public class Comissionado implements Padroes {

	private float comissao;

	
	
	
	
	
	public String  getAll() {
return 	
	"Comissao" + comissao + "\n";
	}

	public void setAll(float comissao) {
				this.comissao = comissao;
	}

	public Comissionado(float comissao) {
		super();
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
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
