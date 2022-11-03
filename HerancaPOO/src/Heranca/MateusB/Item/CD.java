package Heranca.MateusB.Item;

public class CD extends Midia {
	
	public CD(int codigo, String descricao) {
		super(codigo, descricao);
	}
	
	private int faixas;
	private String artista; 
	private String album;
	
	
	
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
