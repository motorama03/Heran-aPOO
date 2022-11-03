package Heranca.MateusB.Nave;

public class NaveEspacial {

	private double velocidadeMax;
	
	public NaveEspacial(double velocidadeMax) {
		setVelocidadeMax(velocidadeMax);
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveEspacial [velocidadeMax=");
		builder.append(velocidadeMax);
		builder.append("] \n");
		return builder.toString();
	}
	
	
	
}
