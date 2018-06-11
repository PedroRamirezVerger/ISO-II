package dominio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Comprobar {
    private ArrayList<Cancion> canciones = new ArrayList<Cancion>();
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String titular;
		Long numtarj;
		String entidad;
		int dia;
		int mes;
		int año;
		int CVV;
        ArrayList<Cliente> clientes;
        clientes = leerClientes("\\Users\\artur\\Desktop\\Clientes.txt", "\\Users\\artur\\Desktop\\Tarjetas.txt");
       
        Fecha fecha;
		do {
        	System.out.println("Introduzca el nombre y apellidos de titular de la tarjeta");
        	titular = sc.nextLine();
        	while(titular.length()>255 || titular.length()<1){
        		System.out.println("Error introduzca su nombre y apellidos con un rango entre 0 y 255 caracteres");
        		System.out.println("Introduzca el nombre y apellidos de titular de la tarjeta");
            	titular = sc.nextLine();
        	}
        	System.out.println("Introduzca el número de la tarjeta de credito");
        	numtarj = sc.nextLong();
        	while(numtarj.toString().length() !=16 || numtarj<0 || numtarj>9999999999999999L){
        		System.out.println("Error introduzca el número de su tarjeta con un rango entre 0000000000000000 y 9999999999999999");
        		System.out.println("Introduzca el número de la tarjeta de credito");
        		numtarj = sc.nextLong();
        	}
        	System.out.println("Introduzca la entidad a la que pertenece su tarjeta");
        	entidad = sc.nextLine();
        	while(entidad.length()>255){
        		System.out.println("Error el nombre de la entidad a la que pertenece con un rango de 0 a 255 caracteres");
        		System.out.println("Introduzca la entidad a la que pertenece su tarjeta");
            	entidad = sc.nextLine();	
        	}
        	System.out.println("Introduzca la fecha de caducidad de su tarjeta. Formato Dia/Mes/Año DD/MM/AA");
        	System.out.println("Introduzca el dia");
        	dia = sc.nextInt();
        	while(dia>31 || dia<1){
        		System.out.println("Error el dia tiene que ser mayor que 0 y menor que 32");
            	System.out.println("Introduzca el dia");
            	dia = sc.nextInt();
        	}
        	System.out.println("Introduzca el mes");
        	mes = sc.nextInt();
        	while(mes<0 || mes > 12){
        		System.out.println("Error el mes tiene que ser mayor que 0 y menor que 13");
        	  	System.out.println("Introduzca el mes");
            	mes = sc.nextInt();
        	}
        	System.out.println("Introduzca el año");
        	año = sc.nextInt();
        	while(año<2017){
        		System.out.println("Error el año tiene que ser mayor que 2017");
        	  	System.out.println("Introduzca el año");
            	año = sc.nextInt();
        	}
        	fecha=new Fecha(dia, mes, año);
        	System.out.println("Introduzca el CVV de su tarjeta");
        	CVV = sc.nextInt();
        	while(Integer.toString(CVV).length()!=3 || CVV<0 || CVV>999){
        		System.out.println("Error introduzca el CVV de su tarjeta con un rango entre 000 y 999");
        		System.out.println("Introduzca el CVV de su tarjeta");
            	CVV = sc.nextInt();	
        	}
        	}while(Autenticar(titular, numtarj,entidad, fecha.getFecha(), CVV) ==  false); 
        	
        }
	public String comprobartitular(String titular){
		String cierto="";
		if(titular.length()>255 || titular.length()<1){
			System.out.println("ERROR AL INTRODUCIR TITULAR");
			cierto="Correcto";
		}
		if(titular.length()<255||titular.length()>1){
			cierto="Correcto";
		}
		return cierto;
		
	}
	public String comprobartarjeta(Long numtarj){
		String cierto="";
		if(numtarj.toString().length() !=16 ){
			System.out.println("ERROR AL INTRODUCIR NUMERO TARJETA");
			cierto="Correcto";
		}
		if(numtarj.toString().length() ==16 || numtarj>0 || numtarj<9999999999999999L){
			cierto="Correcto";
		}
		return cierto;
	}
	public String comprobarentidad(String entidad){
		String cierto="";
		if(entidad.length()>255){
			System.out.println("ERROR AL INTRODUCIR ENTIDAD");
			cierto="Correcto";	
		}
		if(entidad.length()<255){
			cierto="Correcto";
		}
		return cierto;
	}
	public String comprobardia(int dia){
		String cierto="";
		if(dia>31 || dia<1){
			System.out.println("ERROR AL INTRODUCIR DIA");
			cierto="Correcto";
		}
		
		if(dia<31 || dia>1){
			cierto="Correcto";
		}
		return cierto;
	}
	public String comprobarmes(int mes){
		String cierto="";
		if(mes<0 || mes > 12){
			System.out.println("ERROR AL INTRODUCIR MES");
			cierto="Correcto";
		}
		
		
		if(mes>0 || mes < 12){
			cierto="Correcto";
		}
		return cierto;
	}
	public String comprobaraño(int año){
		String cierto="";
		if(año<2017){
			System.out.println("ERROR AL INTRODUCIR AÑO");
			cierto="Correcto";
		}
		if(año>2017){
			cierto="Correcto";
		}
		return cierto;
	}
	public String comproCVV(int CVV){
		String cierto="";
		if(Integer.toString(CVV).length()!=3 || CVV<100 || CVV>999 ){
			System.out.println("ERROR AL INTRODUCIR CVV");
			cierto="Correcto";
		}
		if(Integer.toString(CVV).length()==3 || CVV>0 || CVV<999){
			cierto="Correcto";
		}
		return cierto;
	}
	
	

	 public static boolean  Autenticar(String titular, long numtarj, String entidad, String fechacaducidad, int cVC) throws IOException
	 {
	     boolean result = false;
	     ArrayList<Tarjeta> lista = leerTarjetas("Tarjetas.txt", numtarj);
	    
	     for(int i=0; i< lista.size(); i++) {
	         if(lista.get(i).getTitular().equals(titular) && lista.get(i).getNumTarjeta()==numtarj && lista.get(i).getFechaCaducidad().equals(fechacaducidad) && lista.get(i).getCodVerificacion()== cVC){
	             result = true;
	             System.out.println("Datos introducidos correctamente correctos. Gracias por su compra :D!!");
	             break;
	         }else{
	        	 System.out.println("Datos introducidos incorrectamente");
	         }
	            
	     }
	    
	     return result;
	 }

	public static ArrayList<Cliente> leerClientes(String fichero_clientes, String fichero_tarjetas) throws IOException {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
		Cliente cliente;
		try {
			File f = new File(fichero_clientes);
			Scanner nombre_f = new Scanner(f);
			while (nombre_f.hasNext()) {
				String dni = nombre_f.next();
				String nombre = nombre_f.next();
				String apellidos = nombre_f.next();
				long Ntarjeta = nombre_f.nextLong();
				tarjetas = leerTarjetas(fichero_tarjetas, Ntarjeta);
				String Fecha = nombre_f.next();
				String dia1 = Fecha.substring(0, 2); // cogemos de la fecha los
														// caracteres que
														// representan el d�a
				int dia = Integer.parseInt(dia1);
				String mes1 = Fecha.substring(3, 5); // cogemos de la fecha los
														// caracteres que
														// representan el mes
				int mes = Integer.parseInt(mes1);
				String anio1 = Fecha.substring(6, 10); // cogemos de la fecha
														// los caracteres que
														// representan el a�o
				int anio = Integer.parseInt(anio1);
				Fecha Fnacimiento = new Fecha(dia, mes, anio);
				long telefono = nombre_f.nextLong();
				String email = nombre_f.next();
				cliente = new Cliente(dni, nombre, apellidos, tarjetas, Fnacimiento, telefono, email);

				clientes.add(cliente);
				System.out.println(cliente.toString());
			}

			nombre_f.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return clientes;
	}

	public static ArrayList<Tarjeta> leerTarjetas(String fichero_tarjetas, long Ntarjeta) throws IOException {
		ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
		Tarjeta tarjeta;
		try {
			File f = new File(fichero_tarjetas);
			Scanner nombre_f = new Scanner(f);
			boolean seguir = true;
			while (nombre_f.hasNext() && seguir) {
				long Numtarjeta = nombre_f.nextLong();// si es el mismo esos
														// ser�n los datos de la
														// tarjeta del cliente
				if (Ntarjeta == Numtarjeta) {
					seguir = false; // en este for primero lee el n� de la
									// tarjeta y lo compara con el n� de tarjeta
									// pasado como par�metro,

					String titular = nombre_f.next();
					String entidad = nombre_f.next();
					String Fnacimiento = nombre_f.next();
					String dia1 = Fnacimiento.substring(0, 2); // cogemos de la
																// fecha los
																// caracteres
																// que
																// representan
																// el d�a
					int dia = Integer.parseInt(dia1);
					String mes1 = Fnacimiento.substring(3, 5); // cogemos de la
																// fecha los
																// caracteres
																// que
																// representan
																// el mes
					int mes = Integer.parseInt(mes1);
					String anio1 = Fnacimiento.substring(6, 10); // cogemos de
																	// la fecha
																	// los
																	// caracteres
																	// que
																	// representan
																	// el a�o
					int anio = Integer.parseInt(anio1);
					Fecha fecha = new Fecha(dia, mes, anio);
					int cod_verificacion = nombre_f.nextInt();
					tarjeta = new Tarjeta(Numtarjeta, titular, entidad, fecha, cod_verificacion);
					tarjetas.add(tarjeta);
				} else {
					nombre_f.nextLine();
				}
			}
			nombre_f.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return tarjetas;

	}

	public static ArrayList<Cancion> leerCanciones(String fichero_canciones,String fichero_artistas, String fichero_albumes) throws IOException {
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		Cancion cancion;
		Artista artista;
		Album album;
		try {
			File f = new File(fichero_canciones);
			Scanner nombre_f = new Scanner(f);
			while (nombre_f.hasNext()) {
				int id = nombre_f.nextInt();
				String cancion1 = nombre_f.next();
				String estilo = nombre_f.next();
				String artista1 = nombre_f.next();
				String album1 = nombre_f.next();
				int duracion = nombre_f.nextInt();
				double precio = nombre_f.nextDouble();
				artista = leerArtistas(fichero_artistas, artista1);
				album = leerAlbumes(fichero_albumes, album1);
				cancion = new Cancion(id, cancion1, estilo, artista, album, duracion,precio);
				canciones.add(cancion);
				}
			nombre_f.close();
		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return canciones;
	}
	private static Album leerAlbumes(String fichero_albumes, String album1) {
		Album album = null;
		try {
			File f = new File(fichero_albumes);
			Scanner nombre_f = new Scanner(f);
			boolean seguir = true;
			while (nombre_f.hasNext()) {
					String nombrealbum = nombre_f.next();
		          if(nombrealbum == album1){
		          seguir = false;
				  String artista = nombre_f.next();
				  String cancion = nombre_f.next();
				  int id = nombre_f.nextInt();
				  double precio = nombre_f.nextDouble();
				  album = new Album(id, nombrealbum, cancion, precio, artista);
				     
	                }
              else{
                  nombre_f.nextLine();
              }
		  	}
		  	nombre_f.close();
          }catch(Exception ex){
          	ex.printStackTrace();
          }
        	return album;	

		  }

	public static Artista leerArtistas(String fichero_artistas, String artista1) throws IOException {
		Artista artista = null;
		try {
			File f = new File(fichero_artistas);
			Scanner nombre_f = new Scanner(f);
			boolean seguir = true;
			while (nombre_f.hasNext()) {
				String nombreartista = nombre_f.next();
		          if(nombreartista == artista1){
		          seguir = false;
				  String nombrecancion = nombre_f.next();
				  String nombrealbum = nombre_f.next();
				  artista = new Artista(nombreartista, nombrecancion, nombrealbum);
				     
	                }
              else{
                  nombre_f.nextLine();
              }
		  	}
		  	nombre_f.close();
          }catch(Exception ex){
          	ex.printStackTrace();
          }
        	return artista;	

		  }
    public Cancion BuscarCancion(int id){ 
        Cancion c = null;
        boolean seguir = true;
        for(int i = 0; i < canciones.size() && seguir; i++){ 
			if(canciones.get(i).getId()==id){ 
                c = canciones.get(i);
                seguir = false;
            }
        }
        return c;
    }
}
