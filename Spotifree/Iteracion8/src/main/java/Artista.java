import java.util.ArrayList;

public class Artista {

	private String nombre;
	private String canciones;
	private	String albumes; 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCanciones() {
		return canciones;
	}

	public void setCanciones(String canciones) {
		this.canciones = canciones;
	}

	public String getAlbumes() {
		return albumes;
	}

	public void setAlbumes(String albumes) {
		this.albumes = albumes;
	}

	public Artista(String nombre, String canciones, String albumes) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
		this.albumes = albumes;
	}
}
