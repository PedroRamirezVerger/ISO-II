package dominio;

public class Cliente {
	
	public Cliente() {
		
	}
	
	public boolean conectar(Servidor s) {
		Cliente c=new Cliente();
		Conexion conexion = new Conexion(c, s);
		return conexion.conectar(s, c);
	}
	public String imprimirMensaje(String m) {
		return m;
	}
}
