package atv1;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agc, int numConta, String cliente) {
		super(agc, numConta, cliente);
		this.setTipo("Poupan�a");
	}

	@Override
	public void sacar(double valor) {
		
		if(valor > this.getSaldo()) {
				System.out.println("Sem saldo suficiente para o saque!");
		}else {
			System.out.println("Valor sacado " + valor);
			double saque = (this.getSaldo() - valor);
			this.depositar(saque);
			System.out.println("Saldo d�sponivel ap�s o saque: "+ this.getSaldo());
		}
	}
	
	

}
