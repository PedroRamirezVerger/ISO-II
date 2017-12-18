import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	String nombre;
		String contrasena;
    	Scanner sc = new Scanner(System.in);
    	do {
    	System.out.println("Introduzca su nombre de usuario");
    	nombre = sc.nextLine();
    	System.out.println("Introduzca su contraseña");
    	contrasena = sc.nextLine();
    	}while(Comprobrar(nombre, contrasena) ==  false); 
    	
    }

	private static boolean Comprobrar(String nombre ,String contrasena) throws IOException{
    	if(Login.Autenticar(nombre, contrasena)) {
    		System.out.println("Nombre de usuario y contraseña correctos. Gracias por usar Spotifree!!");
    	}else {
    		System.out.println("Nombre de usuario o contraseña incorrectos");
    	}

		return Login.Autenticar(nombre, contrasena);
	}
}

