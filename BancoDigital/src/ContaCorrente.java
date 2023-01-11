
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("\n\n ***** Extrato Conta Corrente *****");
		imprimirInfosComuns();
	}
}
