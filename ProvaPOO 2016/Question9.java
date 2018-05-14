package prova;

public class Question9 {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Rafael", "123.879.000-10");
		ContaPoupanca cp1 = new ContaPoupanca(c1, "452");
		ContaCorrente cc1 = new ContaCorrente(c1, "853");
		
		Cliente c2 = new Cliente("Douglas", "456.962.555-04");
		ContaPoupanca cp2 = new ContaPoupanca(c2, "454");
		ContaCorrente cc2 = new ContaCorrente(c2, "856");
		
		System.out.println(c1.getNomeCliente() + " " + c1.getCpfCliente());
		System.out.println(c2.getNomeCliente() + " " + c2.getCpfCliente());
		
		cp1.renderJuros(0.01); //render juros na conta do Rafael
		
		cp1.limiteChequeEspecial = 1000.00; //limite chque especial Rafael
		cp2.limiteChequeEspecial = 1000.00; //limite chque especial Douglas
		
		cp1.creditar(1000.00); //creditar na conta poupanca do Rafael
		cp2.creditar(1000.00); //creditar na conta poupanca do Douglas
		
		cp1.debitar(200.00); //debitar na conta poupanca do Rafael
		cp2.debitar(200.00); //debitar na conta poupanca do Douglas
		
		System.out.println(cp1.getSaldo()); // ver saldo do Rafael
		System.out.println(cp2.getSaldo()); // ver saldo do Douglas
		
		cp2.transferir(cp1, 150.00); // transferir dinheiro do Douglas para o Rafael
		
		System.out.println(cp1.getSaldo());
		System.out.println(cp2.getSaldo());
		
	}

}
