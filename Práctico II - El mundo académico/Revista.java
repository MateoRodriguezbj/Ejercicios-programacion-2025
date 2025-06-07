package mundoacademico;

public class Revista extends Publicacion {
	
	int numero;
	
	public Revista(String titulopublicacion, String autor, int añopubli, String editorial, int numero) {
		super(titulopublicacion, autor, añopubli, editorial);
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

}
