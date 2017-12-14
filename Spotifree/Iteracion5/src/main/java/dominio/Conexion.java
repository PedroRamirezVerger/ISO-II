package dominio;

public class Conexion {
	private Cliente cliente;
	private Servidor servidor;
	private String mensaje;
	public Conexion(Cliente cliente, Servidor servidor) {
		super();
		this.cliente = cliente;
		this.servidor = servidor;
	}
	
	public boolean conectar(Servidor s, Cliente c) {
		return s.aceptarConexion(c);
	}
	public void enviarMensaje(Cliente c, String m) {
		c.imprimirMensaje(m);
	}
}
