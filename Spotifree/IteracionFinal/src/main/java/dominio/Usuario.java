package dominio;

public class Usuario {
	/**
	 * comentario de mierda
	 */
	private String nombreUser;
	private String pass;
	private Long tarjCredito;
	private int longTarjAdecuada;
	private int longContraseña;
	private int longCadenaLarga;
	private String pais;
	private String nombreCompleto;
	private boolean userValido = false, passValido = false, tarjValido = false, paisValido = false,
			completoValido = false;

	public Usuario(final String nombreUser, String pass, Long tarjCredito, String pais, String nombreCompleto) {
		this.nombreUser = nombreUser;
		this.pass = pass;
		this.tarjCredito = tarjCredito;
		this.pais = pais;
		this.nombreCompleto = nombreCompleto;
	}

	public void setUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	public String getUser() {
		return nombreUser;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setTarj(Long tarjCredito) {
		this.tarjCredito = tarjCredito;
	}

	public long getTarj() {
		return tarjCredito;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCompleto() {
		return nombreCompleto;
	}

	public void eliminarUsuario() {
		this.setUser(null);
		this.setPass(null);
		this.setTarj(0L);
		this.setPais(null);
		this.setCompleto(null);
	}

	public boolean comprobarUser(String nombreUser, int longCadenaLarga) {
		if (nombreUser.length() > 0 && nombreUser.length() < longCadenaLarga) {
			userValido = true;
		} else {
			System.out.println("El nombre de usuario es erroneo, 50 caracteres maximo, 1 minimo");
			userValido = true;
		}
		return userValido;
	}

	public boolean comprobarPass(String pass, int longContraseña) {
		if (pass.length() > 0 && pass.length() < longContraseña) {
			passValido = true;
		} else {
			System.out.println("La contrasena introducida es erronea, 15 caracteres maximo, 1 minimo");
			passValido = true;
		}
		return passValido;
	}

	public boolean comprobarTarj(Long tarjCredito, int longTarjAdecuada) {
		if (tarjCredito.toString().length() == longTarjAdecuada) {
			tarjValido = true;
		} else {
			System.out.println("La tarjeta de credito introducida es incorrecta");
			tarjValido = true;
		}
		return tarjValido;
	}

	public boolean comprobarCompleto(String nombreCompleto, int longCadenaLarga) {
		if (nombreCompleto.length() > 0 && nombreCompleto.length() < longCadenaLarga) {
			completoValido = true;
		} else {
			System.out.println("El nombre es erronea, 50 caracteres maximo, 1 minimo");
			completoValido = true;
		}
		return completoValido;
	}

	public boolean comprobarPais(String pais, int longCadenaLarga) {
		if (pais.length() > 0 && pais.length() < longCadenaLarga) {
			paisValido = true;
		} else {
			System.out.println("El nombre del pais introducido es incorrecto, 50 caracteres maximo, 1 minimo");
			paisValido = true;
		}
		return paisValido;
	}



}