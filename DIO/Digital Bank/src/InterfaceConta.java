public interface InterfaceConta {
	public void sacar(double valor);
	public void depositar(double valor);
	public void transferir(Conta contaDestino, double Valor);
	public void imprimirExtrato();
}
