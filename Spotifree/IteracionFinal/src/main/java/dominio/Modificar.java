package dominio;

public class Modificar {
	public Cancion modificarcancion(final Cancion c,final int duracion,final int id,final String nombre,final String estilo,final Artista artista,
			final Album album,final double precio) {
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
