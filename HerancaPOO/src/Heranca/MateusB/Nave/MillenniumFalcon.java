package Heranca.MateusB.Nave;

public class MillenniumFalcon extends Apolo11 {
	
	public MillenniumFalcon(double velocidadeMax){
		super(velocidadeMax);
	}
	
	
	
	private double classeHiperpropulsor;

	public double getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(double classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("MillenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
