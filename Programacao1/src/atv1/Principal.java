package atv1;

public class Principal {

		public static void main(String args[]) {
			
			Conta p1 = new ContaCorrente(134, 5555, "Beltrano");
			
			
		    
			System.out.println("Conta "+ p1.getTipo());
			System.out.println("Cliente: " + p1.getCliente());
			System.out.println("N�mero da Conta: "+ p1.getNumConta());
			System.out.println("Ag�ncia: "+ p1.getAgc());
			System.out.println("Saldo D�sponivel: "+ p1.getSaldo());
			
			System.out.println("---------------------------------------------------------------------------");
			
			Conta p2 = new ContaPoupanca(254, 651, "Fulano");
			
			System.out.println("Conta "+ p2.getTipo());
			System.out.println("Cliente: " + p2.getCliente());
			System.out.println("N�mero da Conta: "+ p2.getNumConta());
			System.out.println("Ag�ncia: "+ p2.getAgc());
			System.out.println("Saldo D�sponivel: "+ p2.getSaldo());
			
		}
}
