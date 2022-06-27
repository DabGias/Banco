
public abstract class Conta {
	private int numero;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numero, String nomeTitular) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}
	
	public void depositar(double valor) {
		if (valor > 0) saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor > 0) saldo -= valor;
	}
	
	public void transferir(double valor, Conta contaDeDestino) {
		this.saldo -= valor;
		contaDeDestino.depositar(valor);
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumero() {
		return numero;
	}
}
