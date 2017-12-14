package dominio;

public class Modificar {
	public Cancion modificarcancion(Cancion c, double duracion, int id, String nombre, String estilo, Artista artista,
			Album album, double precio) {
		c.setDuracion(duracion);
		c.setId(id);
		c.setNombre(nombre);
		c.setEstilo(estilo);
		c.setArtista(artista);
		c.setAlbum(album);
		c.setPrecio(precio);
		
		return c;
	}
}
