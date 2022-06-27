
public class ContaPoupanca extends Conta {
	private double taxaDeRendimento;
	
	public ContaPoupanca(int numero, String nomeTitular, double taxaDeRendimento) {
		super(numero, nomeTitular);
		this.taxaDeRendimento = taxaDeRendimento;
	}

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}
}
