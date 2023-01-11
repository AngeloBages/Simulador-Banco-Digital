import java.util.Scanner;

public class Main {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Cliente outroCliente = new Cliente();
		
		Conta conta = null;
		Conta outraConta = null;
		String contaEscolhida;
		
		System.out.println("Para a abertura de uma conta, informe seu nome: ");
		cliente.setNome(ler.next()); 
		
		do {
			
			System.out.println(" cc - conta corrente");
			System.out.println(" cp - conta poupança");
			System.out.print("\n ___: ");
			contaEscolhida = ler.next();
		    
			if(contaEscolhida.equals("cc")) {

				conta = new ContaCorrente(cliente);
				outraConta = new ContaCorrente(outroCliente);
			}
	        if(contaEscolhida.equals("cp")){// (contaEscolhida == "cp") {
				
			    conta = new ContaPoupanca(cliente);
			    outraConta = new ContaPoupanca(outroCliente);
			}
		}while(!contaEscolhida.equals("cc")  &&  !contaEscolhida.equals("cp"));
		
        conta.depositar(500);
        conta.sacar(50);
        conta.transferir(20, outraConta);
		conta.imprimirExtrato();
	}
}
