import java.util.Scanner;

public class Comprar {
	
private Scanner sc;
public static void main(String[]args){
	Comprar(Cancion.getTitulo(),Cancion.getArtista(),Cancion.getPrecio());
}
	public boolean ComprobarTarjeta(int numero,int cvv,int dia1,int mes1){
		sc = new Scanner(System.in);
		System.out.println("Introduzca su número de tarjeta: ");
		int Num_tarjeta = sc.nextInt();
		while(numero==Num_tarjeta){
			System.out.println("Número de tarjeta introducido incorrectamente");
			System.out.println("Introduzca su número de tarjeta: ");
			Num_tarjeta = sc.nextInt();
		}
		System.out.println("Introduzca el CVV de la tarjeta: ");
		int CVV = sc.nextInt();
		while(cvv==CVV){
			System.out.println("CVV introducido incorrectamente");
			System.out.println("Introduzca el CVV de la tarjeta: ");
			CVV = sc.nextInt();
		}
		System.out.println("Introduzca el dia de caducidad de su tarjeta: ");
		int dia = sc.nextInt();
		while(dia1==dia){
			System.out.println("Dia introducido incorrectamente");
			System.out.println("Introduzca el dia de caducidad de su tarjeta: ");
			dia = sc.nextInt();
	}
		System.out.println("Introduzca el mes de caducidad de su tarjeta: ");
		int mes = sc.nextInt();
		while(mes1==mes){
			System.out.println("Mes introducido incorrectamente");
			System.out.println("Introduzca el mes de caducidad de su tarjeta: ");
			mes = sc.nextInt();
		}
	
}
	public void Comprar(String titulo,String artista,double precio){
		ComprobarTarjeta(Cliente.getNumTarjeta(), Cliente.getCVV(), Cliente.getDia(), Cliente.getMes());
		System.out.println("Datos de la Tarjeta introducidos correctamente");
		System.out.println("Usted a comprado: " + titulo + " de " + artista +" por " + " precio " + precio + "€");
	}
}

