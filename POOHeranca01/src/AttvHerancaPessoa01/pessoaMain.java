package AttvHerancaPessoa01;
import java.util.Scanner;

public class pessoaMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		pessoaFisica pesf = new pessoaFisica("Mateus", "Agronômica", "122.786.899-59", "Namorando");
		System.out.println(pesf);
		pesf.setCpf("122.786.899-62");
		pesf.setEstadoCivil ("Namorando");
		System.out.println(pesf);
		
		pessoaJuridica pesj = new pessoaJuridica("VitóriaModas", "466.721.000-1", "E-Empresa Software");
		System.out.println(pesj);
		
		entrada.close();
		
	}

}
