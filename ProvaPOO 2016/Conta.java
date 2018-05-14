package prova;

public class Conta{
	private String numero;
	private double saldo;
	protected Cliente cli;
	
	public Conta(Cliente cli, String numero) {
		this.cli = cli;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void creditar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Não é possível creditar esse valor!");
		}
	}
	
	public void debitar(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Não é possível debitar esse valor!");
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		if(valor > 0 && this.saldo >= valor) {
			this.debitar(valor);
			contaDestino.creditar(valor);
		} else {
			System.out.println("Não foi possível transferir o valor!");
		}
	}
}
