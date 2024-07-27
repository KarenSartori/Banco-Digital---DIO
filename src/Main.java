public class Main {
    
    public static void main(String[] args) {
		Cliente karen = new Cliente();
		karen.setNome("Karen");
		
		Conta contaCorrente = new ContaCorrente(karen);
		Conta contaPoupanca = new ContaPoupanca(karen);

		contaCorrente.depositar(300);
		contaCorrente.transferir(100, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
	}
}
