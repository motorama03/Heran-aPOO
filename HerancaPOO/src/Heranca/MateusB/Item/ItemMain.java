package Heranca.MateusB.Item;

//import java.util.Set;

public class ItemMain {

	public static void main(String[] args) {
		
		VHS Videoveio = new VHS(01, "MP4 full HD");
		Videoveio.setDuracao(3);
		Videoveio.setTitulo("Titanique");
		Videoveio.setGravadora("É o pigas");
		
		System.out.println(Videoveio);
		
		CD videonovo = new CD(02, "MP3");
		videonovo.setAlbum("As melhores de 2013");
		videonovo.setArtista("Nirvas");
		videonovo.setDuracao(12);
		videonovo.setFaixas(41);
		videonovo.setGravadora("Gravadora oficial do nirvas");
	
		System.out.println(videonovo);
		
	}

}
