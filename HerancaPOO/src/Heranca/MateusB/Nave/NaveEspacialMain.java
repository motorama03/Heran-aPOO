package Heranca.MateusB.Nave;

public class NaveEspacialMain {

	public static void main(String[] args) {

		MillenniumFalcon naves = new MillenniumFalcon(14000);
		naves.setClasseHiperpropulsor(12000);
		naves.setTipoCombustivel("Disel");
		
		System.out.println(naves);
		
	}

}
