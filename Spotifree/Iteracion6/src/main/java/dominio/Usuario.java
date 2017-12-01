package dominio;

public class Usuario {
	
	private String nombre;
	private String pass;
	private int tarjCredito;
	private String pais;
	private Usuario user = new Usuario (nombre, pass, tarjCredito, pais);
	
	public Usuario (String nombre, String pass, int tarjCredito){
		this.nombre = nombre;
		this.pass = pass;
		this.tarjCredito = tarjCredito;
		this.pais = pais;
	}
	
	public void setNombre (String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setPass (String pass){
		this.pass = pass;
	}
	public String getPass(){
		return pass;
	}
	public void setTarj (int tarjCredito){
		this.tarjCredito = tarjCredito;
	}
	public int getTarj(){
		return tarjCredito;
	}
	public void setPais (String pais){
		this.pais = pais;
	}
	public String getPais(){
		return pais;
	}
	
	
	public void eliminarUsuario (){
		user.setNombre(null);
		user.setPass(null);
		user.setTarj(0);
		user.setPais(null);
	}
	

}
