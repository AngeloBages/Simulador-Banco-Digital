
public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	
	protected double saldo;
	protected int agencia;
	protected int numero;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	public void depositar(double valor) {
		saldo += valor; 
		System.out.printf("\n Valor Depositado: R$%s", valor);
	}
	public void sacar(double valor) {
		saldo -= valor;
	    System.out.printf("\n Valor Sacado: R$%s", valor);
	}
	public void transferir(double valor, Conta conta) {
		saldo-=valor;
		conta.saldo = valor; 
		System.out.printf("\n Valor Transferido: R$%s", valor);
	}
	protected void imprimirInfosComuns() {
		System.out.printf("\n Titular: %s", cliente.getNome());
		System.out.printf("\n Agencia: %s", agencia);
		System.out.printf("\n Numero: %s", numero);
	    System.out.printf("\n Saldo: %.2f", saldo);
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	protected abstract void imprimirExtrato();
}
