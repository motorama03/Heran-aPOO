package Heranca.MateusB.Ambiente;

public class Sala extends Ambiente {
	public Sala(double area) {
		super(area);
	}
	
	private boolean TV;

	public boolean isTV() {
		return TV;
	}

	public void setTV(boolean tV) {
		TV = tV;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String tvs;
		if(TV == true) {
			tvs = "possui";
		}else {
			tvs = "ñ possui";
		}
		builder.append(super.toString());
		builder.append("Sala [TV=");
		builder.append(tvs);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
