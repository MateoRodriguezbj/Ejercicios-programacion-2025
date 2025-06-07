package mundoacademico;

public class Libro extends Publicacion {
	
	String numeroPaginas;
	String genero;

	public Libro(String titulopublicacion, String autor, int añopubli, String editorial, String numeroPaginas,
			String genero) {
		super(titulopublicacion, autor, añopubli, editorial);
		this.numeroPaginas = numeroPaginas;
		this.genero = genero;
	}

	public String getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(String numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
	
