package Heranca.MateusB.RelacaoAlunoProfessor;

public class Professor extends Pessoa {
	
	public Professor(int codigo, String nome, String endereco){
		super(codigo, nome, endereco);
	}
	
	private String diciplina;

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Professor [diciplina=");
		builder.append(diciplina);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
