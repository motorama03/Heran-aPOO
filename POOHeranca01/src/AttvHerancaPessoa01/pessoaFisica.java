package AttvHerancaPessoa01;

public class pessoaFisica extends pessoa {
	
	public pessoaFisica(String nome, String Endereco, String cpf, String estadocCivil){
		super(nome);
		this.cpf = cpf;
		this.estadoCivil = estadocCivil;
	}

	private String cpf;
	private String estadoCivil;
	
	public String getCpf() {
		if (cpf.length()> 15 || cpf.length()<11){
			cpf = "123.456.789-00";
		}
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		
		saida.append(super.toString());
		saida.append("CPF: "+cpf+"\n");
		saida.append("Estado Civil: "+estadoCivil+"\n");
		
		return saida.toString();
	}
	
}
