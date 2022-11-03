package Heranca.MateusB.Item;

public class VHS extends Midia {

	public VHS(int codigo, String descricao) {
		super(codigo, descricao);
	}
	
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
