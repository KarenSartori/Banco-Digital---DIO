public class Main {
    
    public static void main(String[] args) {
		Cliente karen = new Cliente();
		karen.setNome("Karen");
		
		Conta cc = new ContaCorrente(karen);
		Conta poupanca = new ContaPoupanca(karen);

		cc.depositar(300);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
