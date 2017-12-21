package dominio;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * 
 * 
 * */
public class Cancion {

	private int duracion;
	private int id;
	private String nombre;
	private String estilo;
	private Artista artista;
	private Album album;
	private double precio;
	private GestorCancion miGestor;

	public Cancion(int duracion, int id, String nombre, String estilo, Artista artista, Album album, double precio) {
		super();
		this.duracion = duracion;
		this.id = id;
		this.nombre = nombre;
		this.estilo = estilo;
		this.artista = artista;
		this.album = album;
		this.precio = precio;
		this.miGestor = new GestorCancion();
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
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

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void leer() throws IOException {
		miGestor.leerCancion(this);
	}

	public void limpiarCampos() {
		setAlbum(null);
		setArtista(null);
		setDuracion(0);
		setEstilo(null);
		setId(0);
		setNombre(null);
		setPrecio(0);
	}

	// @Override
	// public boolean equals(Object other){
	// if (other == null) return false;
	// if (other == this) return true;
	// if (!(other.getClass() != this.getClass()))return false;
	// Cancion otherCancion = (Cancion)other;
	// return otherCancion.getId() == id;
	// }
}
