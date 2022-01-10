package atv1;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agc, int numConta, String cliente) {
		super(agc, numConta, cliente);
		this.setTipo("Poupança");
	}

	@Override
	public void sacar(double valor) {
		
		if(valor > this.getSaldo()) {
				System.out.println("Sem saldo suficiente para o saque!");
		}else {
			System.out.println("Valor sacado " + valor);
			double saque = (this.getSaldo() - valor);
			this.depositar(saque);
			System.out.println("Saldo dísponivel após o saque: "+ this.getSaldo());
		}
	}
	
	

}
