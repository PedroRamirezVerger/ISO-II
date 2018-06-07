package org.Iteracion6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dominio.Usuario;

/**
 * Unit test for simple App.
 */
public class AppTest {
	Usuario user;
	@Before
	public void setUp() throws Exception {
		user = new Usuario("Mandarina", "guayabita", 1234567887654321L, "Baguette", "Mandarina Lopez Lopez de Verger Lopez");
	}
	

    /**
     * Rigourous Test :-)
     */
	  @org.junit.Test
    public void testUserExceso()
    {
    	user.setUser("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testPassExceso()
    {
    	user.setPass("aaaaaaaaaaaaaaab");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testTarjExceso()
    {
    	user.setTarj(12975129571295712L);
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testPaisExceso()
    {
    	user.setPais("aaaaaaaaaaaaaaaaaaaaaaaaab");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testCompletoExceso()
    {
    	user.setCompleto("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testUserCorto()
    {
    	user.setUser("");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testPassCorto()
    {
    	user.setPass("");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testTarjCorto()
    {
    	user.setTarj(129751295712957L);
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testPaisCorto()
    {
    	user.setPais("");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
	  @org.junit.Test
    public void testCompletoCorto()
    {
    	user.setCompleto("");
        assertTrue( user.comprobarUser(user.getUser()) );
        assertTrue( user.comprobarPass(user.getPass()) );
        assertTrue( user.comprobarTarj(user.getTarj()) );
        assertTrue( user.comprobarPais(user.getPais()) );
        assertTrue( user.comprobarCompleto(user.getCompleto()) );
    }
}
