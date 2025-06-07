package mundoacademico;

public abstract class Publicacion {
	
	String tituloPublicacion;
	String autor;
	int añopubli;
	String editorial;
	
	public Publicacion(String titulopublicacion, String autor, int añopubli, String editorial) {
		super();
		this.tituloPublicacion = titulopublicacion;
		this.autor = autor;
		this.añopubli = añopubli;
		this.editorial = editorial;
	}

	public String gettituloPublicacion() {
		return tituloPublicacion;
	}

	public void settituloPublicacion(String titulopublicacion) {
		this.tituloPublicacion = titulopublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñopubli() {
		return añopubli;
	}

	public void setAñopubli(int añopubli) {
		this.añopubli = añopubli;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	

}

