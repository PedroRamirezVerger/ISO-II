package dominio;

import java.util.ArrayList;

public class Buscar {
	public int buscarcancionid(ArrayList<Cancion> can, int id) {
		int encontrado=0;
		int idd;
		for(int i=0;i<can.size();i++){
			idd=can.get(i).getId();
			if (idd == id) {
				encontrado=1;
			}
		}
		return encontrado;
	}

	public Cancion buscarcancion(final ArrayList<Cancion> can, final String nombre){
		String name;
		Cancion cancion = null;
		for(int i=0;i<can.size();i++){
			name=can.get(i).getNombre();
			if (name.equals(nombre)) {
				cancion=can.get(i);
			}
		}
		return cancion;
	}

	public Artista buscarcancionArtista(ArrayList<Cancion> can, String nombre) {
		String name;
		Artista art=null;
		int i;
		for(i=0;i<can.size();i++){
			name=can.get(i).getNombre();
			if (name.equals(nombre)) {
				art=can.get(i).getArtista();
			}
		}
		return art;
	}

	public Album buscarcancionAlbum(ArrayList<Cancion> can, String nombre) {
		String name;
		Album art=null;
		int i;
		for(i=0;i<can.size();i++){
			name=can.get(i).getNombre();
			if (name.equals(nombre)) {
				art=can.get(i).getAlbum();
			}
		}
		return art;
	}

	public Artista buscarArtista(ArrayList<Artista> art, String nombre){
		Artista artista=null;
		int i;
		String name;
		for(i=0;i<art.size();i++){
			name=art.get(i).getNombre();
			if (name.equals(nombre)) {
				artista=art.get(i);
			}
		}
		return artista;
	}

	public Album buscarAlbum(ArrayList<Album> alb, String nombre){
		Album albu=null;
		int i;
		String name;
		for(i=0;i<alb.size();i++){
			name=alb.get(i).getNombre();
			if (name.equals(nombre)) {
				albu=alb.get(i);
			}
		}
		return albu;
	}
}
