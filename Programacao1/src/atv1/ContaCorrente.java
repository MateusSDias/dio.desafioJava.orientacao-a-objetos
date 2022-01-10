package atv1;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agc, int numConta, String cliente) {
		super(agc, numConta, cliente);
		this.setTipo("Corrente");
	}

	@Override
	public void sacar(double valor) {
		final double taxa = 0.10;
		
		if(valor > this.getSaldo()) {
				System.out.println("Sem saldo suficiente para o saque!");
		}else {
			System.out.println("Valor sacado " + valor);
			double saque = (this.getSaldo() - valor) - taxa;
			this.depositar(saque);
			System.out.println("Saldo dísponivel após o saque: "+ this.getSaldo());
		}
 	}
	
}
