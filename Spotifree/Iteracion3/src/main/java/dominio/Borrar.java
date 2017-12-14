package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Borrar {
	static Scanner Teclado =new Scanner (System.in);
	static Buscar bus;
	
	public void borrar(ArrayList<Cancion> can){
		System.out.println("Introduce el nombre de la cancion que quieres borrar:");
		String nombre= Teclado.next();
		Cancion c;
		c=bus.buscarcancion(can, nombre);
		can.remove(c);	
	}
}
