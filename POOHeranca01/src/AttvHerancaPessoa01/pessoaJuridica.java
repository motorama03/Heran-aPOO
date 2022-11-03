package AttvHerancaPessoa01;

public class pessoaJuridica extends pessoa {

	public pessoaJuridica(String nome, String cnpj, String tipoEmpresa){
		super(nome);
		this.cnpj = cnpj;
		this.tipoEmpresa = tipoEmpresa;
	}
	
	String cnpj;
	String tipoEmpresa;
	
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	
	
	public String toString() {
		StringBuilder saida = new StringBuilder();
		
		saida.append("Nome: "+super.toString()+"\n");
		saida.append("CNPJ: "+cnpj+"\n");
		saida.append("O tipo da empresa: "+tipoEmpresa+"\n");
	
		return saida.toString();
	}
	
	
	
}
