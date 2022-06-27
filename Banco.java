
public class Banco {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(123, "João");
		ContaPoupanca contaPoupanca = new ContaPoupanca(122, "Michel", 0.02);
		contaCorrente.depositar(1000);
		contaCorrente.depositar(500);
		contaCorrente.sacar(300);
		contaCorrente.transferir(200, contaPoupanca);
		
		System.out.println(contaCorrente.getSaldo());
		System.out.println(contaPoupanca.getSaldo());
	}

}
