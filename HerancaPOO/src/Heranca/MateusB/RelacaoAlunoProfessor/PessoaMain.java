package Heranca.MateusB.RelacaoAlunoProfessor;

public class PessoaMain {

	public static void main(String[] args) {
	
		Aluno aluno = new Aluno(01, "Mateus", "Agronômica");
		aluno.setMatricula(1525123127);
		
		System.out.println(aluno);
		
		Professor prof = new Professor(02, "Juliano", "Rio do Sul");
		prof.setDiciplina("Algoritmo");
		
		System.out.println(prof);
		
	}

}
