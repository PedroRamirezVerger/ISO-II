package org.Iteracion8;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;


import junit.framework.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	private Comprobar h;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	String expected="Correcto";
   
    @Before
	public void setUp() throws Exception {
		h = new Comprobar();
	}
    /**
     * @return the suite of tests being tested
     */
    @After
	public void tearDown() {
	}
    
    @org.junit.Test
    public void testcomprobar(){
    	String titular= "qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphg";
    	Long numtarj= 16L;
    	String entidad="abcde";
    	int dia=12;
    	int mes=14;
    	int año=2018;
    	int CVV=55;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comprobarCVV(CVV));
    	
    }
}
