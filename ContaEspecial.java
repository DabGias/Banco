
public class ContaEspecial extends Conta {
	private double limiteEspecial;
	
	public ContaEspecial(int numero, String nomeTitular, double limiteEspecial) {
		super(numero, nomeTitular);
		this.limiteEspecial = limiteEspecial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
}
