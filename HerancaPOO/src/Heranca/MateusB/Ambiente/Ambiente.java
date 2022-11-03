package Heranca.MateusB.Ambiente;

public class Ambiente {

	private double area;
	
	public Ambiente(double area) {
		setArea(area);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ambiente [area=");
		builder.append(area);
		builder.append("] \n");
		return builder.toString();
	}
	
	
	
}
