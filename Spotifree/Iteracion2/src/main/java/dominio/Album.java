package dominio;

import java.util.ArrayList;

public class Album {

	private ArrayList<Cancion> canciones;
	private int id;
	private String nombre;
	private double precio;
	private Artista Artista;
	public Album(ArrayList<Cancion> canciones, int id, String nombre, double precio, dominio.Artista artista) {
		super();
		this.canciones = canciones;
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		Artista = artista;
	}
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) {
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
	public Artista getArtista() {
		return Artista;
	}
	public void setArtista(Artista artista) {
		Artista = artista;
	}
}
