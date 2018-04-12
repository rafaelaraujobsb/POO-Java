package prova;

public class ContaPoupanca extends ContaCorrente{
	public ContaPoupanca(Cliente cli, String numero) {
		super(cli, numero);
	}
	
	public void renderJuros(double valor) {
		if(valor > 0 && getSaldo() > 0) {
			super.creditar(getSaldo()*(1*valor));
		} else {
			System.out.println("Não foi possível render juros!");
		}
	}
}
