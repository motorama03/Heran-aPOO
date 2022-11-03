package Heranca.MateusB.Ambiente;

public class Banheira extends Ambiente {
	public Banheira(double area) {
		super(area);
	}
	
	private boolean banheira;

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String bnr;
		if(banheira == true) {
			bnr = "possui";
		}else {
			bnr = "ñ possui";
		}
		builder.append(super.toString());
		builder.append("Banheira [banheira=");
		builder.append(bnr);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
