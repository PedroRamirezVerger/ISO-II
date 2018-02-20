package dominio;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class GestorCancion {
	private static String rutaFichero;

	public static void setRutaFichero(final String ruta) {
		rutaFichero = ruta;
	}

	public void leerCancion(final Cancion lacancion) throws IOException {
		final Scanner lector = new Scanner(new File(rutaFichero), "utf-8");
		lector.useDelimiter(";");
		lector.useLocale(Locale.US);
		boolean encontrado = false;
		while (lector.hasNextInt()) {
			if (lector.nextInt() == lacancion.getId()) {
				encontrado = true;
				break;
			}
			lector.nextLine();
		}
		if (encontrado) {
			final int duracion = Integer.parseInt(lector.next());
			final String nombre = lector.next();
			final String estilo = lector.next();
			//final String artistastr = lector.next();
            lector.next(); // artistastr sin usar
			final Artista artista = null;
			//final String albumstr = lector.next();
            lector.next(); // albumstr sin usar
			final Album album = null;
			final double precio = lector.nextDouble();

			lacancion.setDuracion(duracion);
			lacancion.setNombre(nombre);
			lacancion.setEstilo(estilo);
			lacancion.setPrecio(precio);
			lacancion.setAlbum(album);
			lacancion.setArtista(artista);
			lector.close();
		} else {
			lector.close();
			throw new IOException("La canción no se encuentra en el fichero: " + lacancion.toString());
		}
	}

//	public void modificarCancion(Cancion lacancion) throws IOException {
//		//
//	}

	// public ArrayList<Cancion> leerCancionInteractivo(ArrayList<Cancion> can,
	// ArrayList<Artista> art,ArrayList<Album> alb){
	// System.out.println("Introduce la duracion de la cancion en segundos:");
	// int duracion = Integer.parseInt(Teclado.next());
	// System.out.println("Introduce el nombre de la cancion:");
	// String nombre=Teclado.next();
	// System.out.println("Introduce el estilo de la cancion:");
	// String estilo=Teclado.next();
	// System.out.println("Introduce el artista de la cancion:");
	// String artista=Teclado.next();
	// Artista artist=bus.buscarArtista(art, artista);
	// System.out.println("Introduce el album de la cancion:");
	// String album=Teclado.next();
	// Album albu=bus.buscarAlbum(alb, album);
	// System.out.println("Introduce el precio de la cancion:");
	// double precio=Teclado.nextDouble();
	// Cancion cancion=new Cancion(duracion, can.size()+1, nombre, estilo, artist,
	// albu, precio);
	// can.add(cancion);
	// return can;
	// }
}
