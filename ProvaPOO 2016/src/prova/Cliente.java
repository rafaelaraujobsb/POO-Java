package prova;

public class Cliente {
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		this.setCliente(nome, cpf);
	}
	
	private void setCliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNomeCliente() {
		return this.nome;
	}
	
	public String getCpfCliente() {
		return this.cpf;
	}
	
}
