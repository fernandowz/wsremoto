package beans;

import util.PadraoProduto;

public class Cd extends Produto implements PadraoProduto {

	private String artista;
	private int totalFaixas;
	private boolean lancamento;

	//getAll
	public String getAll() {
		return 
				super.getAll() + "\n" +
				"Artista: " + artista + "\n" +
				"Total Faixas: " + totalFaixas + "\n" +
				"Lançamento: " + lancamento + "\n";
	}
	//setAll
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean lancamento) {
		super.setAll(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lancamento = lancamento;
	}
	//construtor vazio
	public Cd() {
		super();
	}
	//construtor cheio
	public Cd(String descricao, float valorVenda, float valorCompra, int id, int qtde, String artista, int totalFaixas,
			boolean lancamento) {
		super(descricao, valorVenda, valorCompra, id, qtde);
		this.artista = artista;
		this.totalFaixas = totalFaixas;
		this.lancamento = lancamento;
	}
	// set and gets
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public boolean isLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}
	@Override
	public float retornarImposto() {
		// TODO Auto-generated method stub
		return getValorVenda() * (float) 0.07;
	}
	@Override
	public float obterValorPromocao(float param) {
		// TODO Auto-generated method stub
		return getValorVenda() - getValorVenda() * (param/90);
	}




}
