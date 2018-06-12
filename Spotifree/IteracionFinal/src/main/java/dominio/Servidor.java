package dominio;

import java.util.ArrayList;

public class Servidor {
	private ArrayList<Cliente> clientes=new ArrayList<Cliente>();
	
	public Servidor(ArrayList<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}
	public boolean aceptarConexion(Cliente c) {
		clientes.add(c);
		return true;
	}

    /* roto
	public void enviarMensaje(Cliente c, String m) {
		Servidor s=new Servidor(clientes);
		Conexion conexion=new Conexion(c, s);
		conexion.enviarMensaje(c, m);
	}
    */

}
