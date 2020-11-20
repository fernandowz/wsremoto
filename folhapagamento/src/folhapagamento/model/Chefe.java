package folhapagamento.model;

public class Chefe implements Padroes	{

	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTermo;
	
	
	
	
	
	public void  setAll(float salarioBase, float adicionalFuncao, float beneficioTermo) {
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTermo = beneficioTermo;
	}
	public String getall() {
		return
				"Salário Base" + salarioBase + "\n" +
				"Adicional Função" + adicionalFuncao + "\n" +
				"Beneficio Termo" + beneficioTermo + "\n";
	}
	public Chefe(float salarioBase, float adicionalFuncao, float beneficioTermo) {
		super();
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTermo = beneficioTermo;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}
	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}
	public float getBeneficioTermo() {
		return beneficioTermo;
	}
	public void setBeneficioTermo(float beneficioTermo) {
		this.beneficioTermo = beneficioTermo;
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
