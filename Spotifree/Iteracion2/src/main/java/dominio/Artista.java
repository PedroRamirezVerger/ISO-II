package dominio;

import java.util.ArrayList;

public class Artista {

	private String nombre;
	private ArrayList<Album> albumes;
	private static ArrayList<Cancion> canciones;
	public Artista(String nombre, ArrayList<Album> albumes, ArrayList<Cancion> canciones) {
		super();
		this.nombre = nombre;
		this.albumes = albumes;
		this.canciones = canciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Album> getAlbumes() {
		return albumes;
	}
	public void setAlbumes(ArrayList<Album> albumes) {
		this.albumes = albumes;
	}
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}
	public static int buscarcancion(int id) {
		int posicion=-1;
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.contains(id)) {
				posicion=canciones.indexOf(id);
			} 
		}
		
		return posicion;
	}
}
