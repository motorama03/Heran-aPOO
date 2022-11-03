package AttvHerancaPessoa01;

public class pessoa {
	
	private String nome;
	private String Endereco;
	
	
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public pessoa(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nome: ");
		builder.append(nome);
		builder.append("\n");
		return builder.toString();
	}
	
	

}