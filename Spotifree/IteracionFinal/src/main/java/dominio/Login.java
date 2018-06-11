package dominio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Login {


	 public static ArrayList<Usuario> GetUsuarios() throws IOException{
	            ArrayList<Usuario> lista = new ArrayList<Usuario>();
	            String cadena;
	            FileReader f = new FileReader("\\Users\\artur\\Desktop\\Trabajo ISO II\\contraseña.txt");
	            BufferedReader b = new BufferedReader(f);
	           
	            while((cadena = b.readLine())!=null) {
	                String[] infousu = cadena.split(","); 
	                Usuario usu = new Usuario(infousu[0], infousu[1]);
	               
	                lista.add(usu);
	            }
	            b.close();
				return lista;
	        }
	        
	 
	   
	    public static boolean  Autenticar(String nombre, String password) throws IOException
	    {
	        boolean result = false;
	        ArrayList<Usuario> lista = GetUsuarios();
	       
	        for(int i=0; i< lista.size(); i++) {
	            if(lista.get(i).getNombre().equals(nombre) && lista.get(i).getContrasena().equals(password)){
	                result = true;
	                break;
	            }
	               
	        }
	       
	        return result;
	    }

	   
}
