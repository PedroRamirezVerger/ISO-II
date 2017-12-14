package org.Iteracion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import dominio.Album;
import dominio.Artista;
import dominio.Buscar;
import dominio.Cancion;

/**
 * Hello world!
 *
 */
public class App {
	public static Buscar bus = null;
 
	public static ArrayList<Cancion> leer(ArrayList<Cancion> can, ArrayList<Artista> art, ArrayList<Album> alb)
			throws IOException {
		File archivo = new File("Canciones");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		while ((linea = br.readLine()) != null) {
			String duracion = linea;
			int id = br.read();
			String nombre = br.readLine();
			String estilo = br.readLine();
			Artista artista;
			artista = bus.buscarcancionArtista(can, br.readLine());
			Album album;
			album = bus.buscarcancionAlbum(can, br.readLine());
			double precio = br.read();
			Cancion cancion = new Cancion(duracion, id, nombre, estilo, artista, album, precio);
			can.add(cancion);
		}
		return can;
	}

	public static void main(String[] args) {
		

	}
}
