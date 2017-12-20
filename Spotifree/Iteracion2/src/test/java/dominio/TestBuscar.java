package dominio;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dominio.Buscar;
import dominio.Cancion;

public class TestBuscar {
	private Buscar buscar;

	@Before
	public void setup() {
		buscar = new Buscar();
	}

	@Test
	public void testBuscarCancionVacio() {
		Cancion res = null;
		ArrayList<Cancion> vacio = new ArrayList<Cancion>();
		String nombre = "test";
		res = buscar.buscarcancion(vacio, nombre);
		assertSame(res, null);
	}

	@Test
	public void testBucarCancion1() {
		Cancion buscada = new Cancion(0, 0, null, null, null, null, 0);
		buscada.setNombre("ejemplo");
		ArrayList<Cancion> array = new ArrayList<Cancion>();
		array.add(buscada);
		Cancion res = buscar.buscarcancion(array, new String("ejemplo"));
		assertSame(res, buscada); // exactamente la misma referencia
	}
	

}