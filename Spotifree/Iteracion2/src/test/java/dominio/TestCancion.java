package dominio;

import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCancion {

	private static int    duracion_normal = 120;
	private static String nombre_normal   = "Bohemian Rhapsody";
	private static String estilo_normal   = "Alternative Country";
	private static String artista_normal  = "El Artista";
	private static String album_normal    = "Best & Worst";
	private static double precio_normal   = 2.1;
	private static File fichero_test;
	private static String[] casos_duracion = {"-5", "0", "1", "12.9", "999", "1000"};
	private static String[] casos_nombre   = {"", "a", "abcde", 
			"qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiiooooop"
			+ "pppphqqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphq"
			+ "qqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwww"
			+ "wweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeee"
			+ "rrrrrtttttyyyyyuuuuuiiiiioooooppppph",
			"qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeeerrrrrttttt"
			+ "yyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiiooooop"
			+ "pppphqqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeeerr"
			+ "rrrtttttyyyyyuuuuuiiiiioooooppppphg"};
	private static String[] casos_estilo = casos_nombre;
	private static String[] casos_artista = casos_nombre;
	private static String[] casos_album = casos_nombre;
	private static String[] casos_precio = {"-1", "0", "1", "5.5", "30", "31"};

	
	@Before
	public void setup() {
		// id;duracion;nombre;estilo;artista;album;precio
		try {
			fichero_test = File.createTempFile("test-canciones", ".csv");
		} catch (IOException e) {
			e.printStackTrace();
			assert(false);
		}
		GestorCancion.setRutaFichero(fichero_test.getAbsolutePath());
		PrintWriter writer = null;
		 try {
			 writer = new PrintWriter(new BufferedWriter(new FileWriter(fichero_test)));
		} catch (IOException e) {
			e.printStackTrace();
			assert(false);
		}
		// casos para probar duración
		for (int i=0; i < casos_duracion.length; i++) {
			writer.println((i + 1) 
			+ casos_duracion[i] + ";"
			+ nombre_normal + ";"
			+ estilo_normal + ";"
			+ artista_normal + ";"
			+ album_normal + ";"
			+ precio_normal  + ";");
		}
		int base = casos_duracion.length;
		// casos para probar nombre
		for (int i=0; i < casos_nombre.length; i++) {
			writer.println((base + i + 1) 
			+ duracion_normal + ";"
			+ casos_nombre[i] + ";"
			+ estilo_normal + ";"
			+ artista_normal + ";"
			+ album_normal + ";"
			+ precio_normal  + ";");
		}
		// casos para probar estilo
		base += casos_nombre.length;
		for (int i=0; i < casos_estilo.length; i++) {
			writer.println((base + i + 1) 
			+ duracion_normal + ";"
			+ nombre_normal + ";"
			+ casos_estilo[i] + ";"
			+ artista_normal + ";"
			+ album_normal + ";"
			+ precio_normal  + ";");
		}
		base += casos_estilo.length;
		// casos para probar artista
		base += casos_artista.length;
		for (int i=0; i < casos_estilo.length; i++) {
			writer.println((base + i + 1) 
			+ duracion_normal + ";"
			+ nombre_normal + ";"
			+ estilo_normal + ";"
			+ casos_artista[i] + ";"
			+ album_normal + ";"
			+ precio_normal  + ";");
		}
		base += casos_artista.length;
		// casos para probar album
		for (int i=0; i < casos_album.length; i++) {
			writer.println((base + i + 1) 
			+ duracion_normal + ";"
			+ nombre_normal + ";"
			+ estilo_normal + ";"
			+ artista_normal + ";"
			+ casos_album[i] + ";"
			+ precio_normal  + ";");
		}
		base += casos_album.length;
		// casos para probar precio
		for (int i=0; i < casos_precio.length; i++) {
			writer.println((base + i + 1) 
			+ duracion_normal + ";"
			+ nombre_normal + ";"
			+ estilo_normal + ";"
			+ artista_normal + ";"
			+ album_normal + ";"
			+ casos_precio[i]  + ";");
		}

	}

	@After
	public void tearDown() {
		fichero_test.deleteOnExit();
	}
	

	@Test
	public void testDuracionInvalid1() {
		int id=1;
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
		try {
			canciontest.leer();
			fail();
		} catch (IOException inesperada) {
			inesperada.printStackTrace();
			fail();
		} catch (Exception esperada) {
		}
	}


	@Test
	public void testDuracionInvalid2() {
		int id=2;
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
		try {
			canciontest.leer();
			fail();
		} catch (IOException inesperada) {
			inesperada.printStackTrace();
			fail();
		} catch (Exception esperada) {
		}
	}


	@Test
	public void testDuracionValid3() {
		int id=3;
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
		try {
			canciontest.leer();
		} catch (IOException inesperada) {
			inesperada.printStackTrace();
			fail();
		} catch (Exception inesperada) {
			inesperada.printStackTrace();
			fail();
		}
	}


	@Test
	public void testDuracionInvalid4() {
		int id=4;
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
		try {
			canciontest.leer();
			fail();
		} catch (IOException inesperada) {
			inesperada.printStackTrace();
			fail();
		} catch (Exception esperada) {
		}
	}


	@Test
	public void testDuracionValid5() {
		int id=5;
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
		try {
			canciontest.leer();
		} catch (IOException inesperada) {
			inesperada.printStackTrace();
			fail();
		} catch (Exception inesperada) {
			inesperada.printStackTrace();
			fail();
		}
	}


	@Test
	public void testDuracionValid6() {
		int id=6;
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
		try {
			canciontest.leer();
		} catch (IOException inesperada) {
			inesperada.printStackTrace();
			fail();
		} catch (Exception inesperada) {
			inesperada.printStackTrace();
			fail();
		}
	}


	
}
