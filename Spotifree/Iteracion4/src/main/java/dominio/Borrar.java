package dominio;

import java.util.ArrayList;

public class Borrar {
	
	
	public void borrar(Cancion c){
		Artista artista=c.getArtista();
		int posicion=artista.buscarcancion(c.getId());
		ArrayList<Cancion> canciones= artista.getCanciones();
		if(posicion!=-1){
			canciones.remove(posicion);
		}
		Album album=c.getAlbum();
		posicion=album.buscarcancion(c.getId());
		canciones=album.getCanciones();
		if(posicion!=-1){
			canciones.remove(posicion);
		}		
		c.borrar();
			
	}
}
