package org.Iteracion8;
import java.util.ArrayList;

public class Cliente {
protected String dni;
protected String nombre;
protected String apellidos;
protected ArrayList<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
protected Fecha Fnacimiento;
protected long telefono;
protected String email;
public Cliente(String dni, String nombre, String apellidos, ArrayList<Tarjeta> tarjetas, Fecha fnacimiento,
		long telefono, String email) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.tarjetas = tarjetas;
	Fnacimiento = fnacimiento;
	this.telefono = telefono;
	this.email = email;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public ArrayList<Tarjeta> getTarjetas() {
	return tarjetas;
}
public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
	this.tarjetas = tarjetas;
}
public Fecha getFnacimiento() {
	return Fnacimiento;
}
public void setFnacimiento(Fecha fnacimiento) {
	Fnacimiento = fnacimiento;
}
public long getTelefono() {
	return telefono;
}
public void setTelefono(long telefono) {
	this.telefono = telefono;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

	public boolean conectar(Servidor s) {
		Cliente c=new Cliente();
		Conexion conexion = new Conexion(c, s);
		return conexion.conectar(s, c);
	}

@Override
public String toString() {
	return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tarjetas=" + tarjetas
			+ ", Fnacimiento=" + Fnacimiento + ", telefono=" + telefono + ", email=" + email + "]";
}



}
