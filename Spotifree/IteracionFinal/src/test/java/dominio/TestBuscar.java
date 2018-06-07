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
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		lista.add(buscada);
		Cancion res = buscar.buscarcancion(lista, new String("ejemplo"));
		assertSame(res, buscada); // exactamente la misma referencia
	}

	@Test
	public void testBucarCancionPrimera() {
		Cancion buscada = new Cancion(122, 123, "buscame", "pop", null, null, 12.95);
		Cancion otra = new Cancion(220, 234, "buscameno", "pop", null, null, 0.25);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		lista.add(buscada);
		lista.add(otra);
		Cancion res = buscar.buscarcancion(lista, new String("buscame"));
		assertSame(res, buscada); // exactamente la misma referencia
	}

	@Test
	public void testBucarCancionUltima() {
		Cancion buscada = new Cancion(122, 123, "buscame", "pop", null, null, 12.95);
		Cancion otra = new Cancion(220, 234, "buscameno", "pop", null, null, 0.25);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		lista.add(otra);
		lista.add(buscada);
		Cancion res = buscar.buscarcancion(lista, new String("buscame"));
		assertSame(res, buscada); // exactamente la misma referencia
	}

	@Test
	public void testBucarCancionMedio() {
		Cancion buscada = new Cancion(122, 123, "buscame", "pop", null, null, 12.95);
		Cancion otra = new Cancion(220, 234, "buscameno", "pop", null, null, 0.25);
		Cancion otramas = new Cancion(200, 234, "Je Nach", "other", null, null, 0.1);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		lista.add(otra);
		lista.add(buscada);
		lista.add(otramas);
		Cancion res = buscar.buscarcancion(lista, new String("buscame"));
		assertSame(res, buscada); // exactamente la misma referencia
	}

	@Test
	public void testBucarCancionFallo() {
		Cancion buscada = new Cancion(500, 123, "Roundaout", "rock", null, null, 12.95);
		Cancion otra = new Cancion(220, 234, "buscameno", "pop", null, null, 0.25);
		Cancion otramas = new Cancion(200, 234, "Je Nach", "other", null, null, 0.1);
		ArrayList<Cancion> lista = new ArrayList<Cancion>();
		lista.add(otra);
		lista.add(buscada);
		lista.add(otramas);
		Cancion res = buscar.buscarcancion(lista, new String("buscame"));
		assertSame(res, null); // exactamente la misma referencia
	}


}