package AttvHerancaConta01;

public class Conta {
	
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	private double valor;
	
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Methodo para saque 
	public String saque(){
		StringBuilder out = new StringBuilder();
		double Total = saldo-valor;
		setSaldo(saldo-valor);
		out.append(Total);
		
		return out.toString();
	}
	
	// Methodo para deposito
	public String Deposito(){
		StringBuilder saida = new StringBuilder();
	
		saida.append(saldo+valor);
		setSaldo(saldo+valor);
	
		return saida.toString();
	}
	
	public String toString() {
		return "Conta [banco=" + banco + ", agencia=" + agencia
				+ ", numeroconta=" + numeroconta + ", saldo=" + saldo + "] \n";
	}
	
	
	
}
