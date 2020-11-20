package beans;

import interfaces.padraoConta;

public class Conta implements padraoConta{

	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;

	//verificarSaldo	
	public float verificarSaldo() {
		return saldo;
	}

	//getAll

	public String getAll() {
		return
				"Numero:  " + numero + "\n" +
				"Digito:  " + digito  + "\n" +
				"Agencia: " +agencia  + "\n" +
				"Saldo: " + saldo  + "\n" +
				cliente.getAll();
	}
	//SetAll

	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	} 

	//construtor vazio
	public Conta() {
		super();
	}   


	// construtor cheio
	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	//get set
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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


