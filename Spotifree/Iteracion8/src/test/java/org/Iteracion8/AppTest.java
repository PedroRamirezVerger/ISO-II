package org.Iteracion8;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;


import junit.framework.*;

public class AppTest 
    
{
	private Comprobar h;
	String expected="Correcto";
   
    @Before
	public void setUp() throws Exception {
		h = new Comprobar();
	}
    @After
	public void tearDown() {
	}
    
    @org.junit.Test
    public void testcomprobar(){
    	String titular= "qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphg";
    	Long numtarj= 1655554589632587L;
    	String entidad="abcde";
    	int dia=12;
    	int mes=14;
    	int año=2018;
    	int CVV=555;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar1(){
    	String titular= "abcde";
    	Long numtarj= 2054547896325874123L;
    	String entidad="abcde";
    	int dia=27;
    	int mes=7;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar2() throws IOException{
    	/*ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    	ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
    	tarjetas = h.leerTarjetas("Tarjeta.txt", 6301287877099260l);
    	Fecha fecha=new Fecha(24, 11, 17);
    	Cliente clie=new Cliente("71358879E","PABLO","PALOTES_PALO",tarjetas,fecha,698741258,"seergioolaargoo@gmail.com");
    	clientes.add(clie);*/
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad="qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppph qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphg ";
    	int dia=27;
    	int mes=7;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	//assertEquals(clientes, h.leerClientes("TestUsuarios", "Tarjeta.txt"));
    }
    @org.junit.Test
    public void testcomprobar3(){
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad="abcde";
    	int dia=42;
    	int mes=7;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar4(){
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad="abcde";
    	int dia=15;
    	int mes=15;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar5(){
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad="abcde";
    	int dia=15;
    	int mes=11;
    	int año=1997;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar6(){
    	String titular= " ";
    	Long numtarj= 1655554589632587L;
    	String entidad="abcde";
    	int dia=12;
    	int mes=14;
    	int año=2018;
    	int CVV=555;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar7(){
    	String titular= "abcde";
    	Long numtarj= 45552L;
    	String entidad="abcde";
    	int dia=12;
    	int mes=14;
    	int año=2018;
    	int CVV=555;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar8() throws IOException{
    	/*ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    	ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
    	tarjetas = h.leerTarjetas("Tarjeta.txt", 6301287877099260l);
    	Fecha fecha=new Fecha(24, 11, 17);
    	Cliente clie=new Cliente("71358879E","PABLO","PALOTES_PALO",tarjetas,fecha,698741258,"seergioolaargoo@gmail.com");
    	clientes.add(clie);*/
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad=" ";
    	int dia=27;
    	int mes=7;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	//assertEquals(clientes, h.leerClientes("TestUsuarios", "Tarjeta.txt"));
    }
    @org.junit.Test
    public void testcomprobar9(){
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad="abcde";
    	int dia=-2;
    	int mes=7;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    @org.junit.Test
    public void testcomprobar10(){
    	String titular= "abcde";
    	Long numtarj= 1658963254789852L;
    	String entidad="abcde";
    	int dia=15;
    	int mes=-23;
    	int año=2019;
    	int CVV=557;
    	assertEquals(expected,h.comprobartitular(titular));
    	assertEquals(expected,h.comprobartarjeta(numtarj));
    	assertEquals(expected,h.comprobarentidad(entidad));
    	assertEquals(expected,h.comprobardia(dia));
    	assertEquals(expected,h.comprobarmes(mes));
    	assertEquals(expected,h.comprobaraño(año));
    	assertEquals(expected,h.comproCVV(CVV));
    	
    }
    
    
}
    
