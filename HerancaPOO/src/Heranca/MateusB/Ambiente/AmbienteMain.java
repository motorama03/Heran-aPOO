package Heranca.MateusB.Ambiente;

public class AmbienteMain {

	public static void main(String[] args) {

		Cozinha coz = new Cozinha(25);
		coz.setMicroondas(true);
		
		System.out.println(coz);
		
		Sala sal = new Sala(30);
		sal.setTV(true);
		
		System.out.println(sal);
		
		
	}

}
