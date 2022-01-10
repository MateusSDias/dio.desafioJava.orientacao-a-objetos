package atv1;

public abstract class Conta {
	
	private int agc;
	private int numConta;
	private String cliente;
	private double saldo;
	private String tipo;
	
	public Conta(int agc, int numConta, String cliente) {
		super();
		if(agc == 0 || numConta == 0) {
			System.out.println("A agência ou número da Conta não podem ser 0!");
			
		}else {
			setAgc(agc);
			setNumConta(numConta);
			setCliente(cliente);
			this.saldo = 0;
			
		}
	}
	
	public void setAgc(int agc) {
		this.agc = agc;
	}
	
	public int getAgc() {
		return this.agc;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public void depositar(double valor) {
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void sacar(double valor);
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
