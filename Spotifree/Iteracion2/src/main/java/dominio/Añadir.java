package dominio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Añadir {
	 static Scanner Teclado =new Scanner (System.in);
	 public static Buscar bus=null;

	public static ArrayList<Cancion> añad(ArrayList<Cancion> can, ArrayList<Artista> art,ArrayList<Album> alb){
		System.out.println("Introduce la duracion de la cancion en segundos:");
		int duracion = Integer.parseInt(Teclado.next());
		System.out.println("Introduce el nombre de la cancion:");
		String nombre=Teclado.next();
		System.out.println("Introduce el estilo de la cancion:");
		String estilo=Teclado.next();
		System.out.println("Introduce el artista de la cancion:");
		String artista=Teclado.next();
		Artista artist=bus.buscarArtista(art, artista);
		System.out.println("Introduce el album de la cancion:");
		String album=Teclado.next();
		Album albu=bus.buscarAlbum(alb, album);
		System.out.println("Introduce el precio de la cancion:");
		double precio=Teclado.nextDouble();
		Cancion cancion=new Cancion(duracion, can.size()+1, nombre, estilo, artist, albu, precio);
		can.add(cancion);
		return can;
	}
}
