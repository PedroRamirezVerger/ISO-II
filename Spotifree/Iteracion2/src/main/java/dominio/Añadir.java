package dominio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Añadir {
 public static void main(String[] args) throws IOException{
	 añad();
 }
	public static ArrayList<Cancion> añad() throws IOException {
		ArrayList<Cancion> can=new ArrayList<>();
		File archivo = new File ("Canciones");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		String linea;
		int atributos=0;
		while((linea=br.readLine())!=null){
			
		}
		return can;
	}
}
