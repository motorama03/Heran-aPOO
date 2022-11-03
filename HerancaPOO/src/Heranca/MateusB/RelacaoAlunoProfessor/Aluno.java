package Heranca.MateusB.RelacaoAlunoProfessor;

public class Aluno extends Pessoa {

	public Aluno(int codigo, String nome, String endereco){
		super(codigo, nome, endereco);
	}
	
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Aluno [matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
