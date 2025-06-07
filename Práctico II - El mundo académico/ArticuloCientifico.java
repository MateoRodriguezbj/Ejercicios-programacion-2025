package mundoacademico;

public class ArticuloCientifico extends Publicacion{
	
	String nombreRevista;
	
	public ArticuloCientifico(String titulopublicacion, String autor, int añopubli, String editorial,
			String nombreRevista) {
		super(titulopublicacion, autor, añopubli, editorial);
		this.nombreRevista = nombreRevista;
	}
	public String getNombreRevista() {
		return nombreRevista;
	}
	public void setNombreRevista(String nombreRevista) {
		this.nombreRevista = nombreRevista;
	}
	
	
	

}
