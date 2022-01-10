package atv1;

public class Cliente {
	
	private String cpf;
	private String nome;
	
	public void Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}

}
