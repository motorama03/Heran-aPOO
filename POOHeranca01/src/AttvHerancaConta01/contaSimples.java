package AttvHerancaConta01;

public class contaSimples extends Conta {

	private double saldoPoupanca;
	private double valorPoupanca;
	
	public contaSimples(String banco, double saldoPoupanca){
		super(banco);
		this.saldoPoupanca = saldoPoupanca;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	// Deposito da Poupon�a
	public String dPouponca(){
		StringBuilder saida = new StringBuilder();
	
		setSaldo(valorPoupanca + saldoPoupanca);
		saida.append(saldoPoupanca);
		
		return saida.toString();
	}
	
	// Saque poupan�a
	public String sPoupanca(){
		StringBuilder saida = new StringBuilder();
		
		setSaldo(saldoPoupanca - valorPoupanca);
		saida.append(saldoPoupanca);
		
		return saida.toString();
	}
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		
		saida.append(super.toString() +"\n");
		saida.append("Saldo disponivel "+saldoPoupanca);
	
		return saida.toString();
	}
	
	
	
	
	
}
