package Heranca.MateusB.Nave;

public class Apolo11 extends NaveEspacial {

	public Apolo11(double velocidadeMax){
		super(velocidadeMax);
	}
	
	private String tipoCombustivel;

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Apolo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append("] \n");
		return builder.toString();
	}
	
	
	
}
