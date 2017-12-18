import java.util.ArrayList;

public class Album {

	private String canciones;
	private int id;
	private String nombre;
	private double precio;
	private String artista;
	public String getCanciones() {
		return canciones;
	}
	public void setCanciones(String canciones) {
		this.canciones = canciones;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista1) {
		artista = artista1;
	}

	public Album(int id2, String nombrealbum, String cancion, double precio2, String artista2) {
		super();
		this.canciones = cancion;
		this.id = id2;
		this.nombre = nombrealbum;
		this.precio = precio2;
		this.artista = artista2;// TODO Auto-generated constructor stub
	}

	
}
