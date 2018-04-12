package prova;

public class ContaCorrente extends Conta{
	double limiteChequeEspecial;
	
	public ContaCorrente(Cliente cli, String numero) {
		super(cli, numero);
	}
	
	public void debitar(double valor) {
		super.debitar(valor);
	}
}
