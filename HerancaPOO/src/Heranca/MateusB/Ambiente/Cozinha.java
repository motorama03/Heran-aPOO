package Heranca.MateusB.Ambiente;

public class Cozinha extends Ambiente{
	public Cozinha(double area){
		super(area);
	}
	
	private boolean microondas;

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String coz;
		if(microondas == true) {
			coz = "possui";
		}else {
			coz = "ñ possui";
		}
		builder.append(super.toString());
		builder.append("Cozinha [microondas=");
		builder.append(coz);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
