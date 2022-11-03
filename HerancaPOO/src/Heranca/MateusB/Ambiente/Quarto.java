package Heranca.MateusB.Ambiente;

public class Quarto extends Ambiente {
	
	public Quarto(double area) {
		super(area);
	}
	
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
