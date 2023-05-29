public class Main {
	public static void main(String[] args) {

		Cliente otthon = new Cliente();
		otthon.setNome("Otthon");

		Conta cCorrente = new ContaCorrente(otthon);
		Conta cPoupanca = new ContaPoupanca(otthon);
		
		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();

		cCorrente.depositar(100);
		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();

		cCorrente.transferir(cPoupanca, 80);
		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
	}
}