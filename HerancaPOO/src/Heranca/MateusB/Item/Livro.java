package Heranca.MateusB.Item;

public class Livro extends Item {
	
	public Livro(int codigo, String descricao /*String autor*/){
		super(codigo,descricao);
		//setAutor(autor);
	}
	
	private String autor;

	
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append("] \n");
		return builder.toString();
	}
	
	
}
