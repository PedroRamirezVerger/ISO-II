package dominio;

import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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

	
	@BeforeClass
	public static void setup() {
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
			 writer = new PrintWriter(new BufferedWriter(new FileWriter(fichero_test)), true);
		} catch (IOException e) {
			e.printStackTrace();
			assert(false);
		}
		// casos para probar duración
		for (int i=0; i < casos_duracion.length; i++) {
			writer.println((i + 1) + ";"
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
			writer.println((base + i + 1) + ";"
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
			writer.println((base + i + 1) + ";"
			+ duracion_normal + ";"
			+ nombre_normal + ";"
			+ casos_estilo[i] + ";"
			+ artista_normal + ";"
			+ album_normal + ";"
			+ precio_normal  + ";");
		}
		base += casos_estilo.length;
		// casos para probar artista
		for (int i=0; i < casos_artista.length; i++) {
			writer.println((base + i + 1) + ";"
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
			writer.println((base + i + 1) + ";"
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
			writer.println((base + i + 1) + ";"
			+ duracion_normal + ";"
			+ nombre_normal + ";"
			+ estilo_normal + ";"
			+ artista_normal + ";"
			+ album_normal + ";"
			+ casos_precio[i]  + ";");
		}
		writer.flush();
		writer.close();
	}

	@Before
	public void setUpTest() {
		GestorCancion.setRutaFichero(fichero_test.getAbsolutePath());

	}
	
	@AfterClass
	public static void tearDown() {
		fichero_test.deleteOnExit();
	}
	

	@Test
	public void testDuracionInvalid1() {
		int id=1;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testNombreInvalid1() {
		int id=7;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testNombreValid2() {
		int id=8;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testNombreValid3() {
		int id=9;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testNombreValid4() {
		int id=10;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testNombreInvalid5() {
		int id=11;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testEstiloInvalid1() {
		int id=12;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testEstiloValid2() {
		int id=13;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testEstiloValid3() {
		int id=14;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testEstiloValid4() {
		int id=15;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testEstiloInvalid5() {
		int id=16;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testArtistaInvalid1() {
		int id=17;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testArtistaValid2() {
		int id=18;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testArtistaValid3() {
		int id=19;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testArtistaValid4() {
		int id=20;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testArtistaInvalid5() {
		int id=21;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testAlbumInvalid1() {
		int id=22;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testAlbumValid2() {
		int id=23;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testAlbumValid3() {
		int id=24;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testAlbumValid4() {
		int id=25;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testAlbumInvalid5() {
		int id=26;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testPrecioInvalid1() {
		int id=27;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testPrecioValid2() {
		int id=28;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testPrecioValid3() {
		int id=29;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testPrecioValid4() {
		int id=30;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testPrecioValid5() {
		int id=31;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
	public void testPrecioValid6() {
		int id=32;
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
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
