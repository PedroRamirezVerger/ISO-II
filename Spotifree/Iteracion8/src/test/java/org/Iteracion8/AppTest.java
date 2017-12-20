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
    @org.junit.Test
    public void testcomprobar1(){
    	String titular= " ";
    	Long numtarj= 1L;
    	String entidad="455D555";
    	int dia=27;
    	int mes=7;
    	int año=1999;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comprobarCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar2(){
    	String titular= " ";
    	Long numtarj= -1L;
    	String entidad="";
    	int dia=-27;
    	int mes=2;
    	int año=-52;
    	int CVV=89;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comprobarCVV(CVV));
    	
    }
}
