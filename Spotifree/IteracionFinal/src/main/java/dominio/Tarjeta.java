package dominio;

public class Tarjeta {
	private long num_tarjeta; // N�mero de la tarjeta de cr�dito
    private String titular; // Titular de la tarjeta de cr�dito
    private String entidad; // Entidad bancaria
    private Fecha fecha_caducidad; // Fecha en la que caduca la tarjeta de cr�dito
    private int cod_verificacion; // C�digo de verificaci�n de la tarjeta de cr�dito
    
    public Tarjeta(long num_tarjeta, String titular, String entidad, Fecha fecha_caducidad, int cod_verificacion){ // Constructor
        this.num_tarjeta = num_tarjeta;
        this.titular = titular;
        this.entidad = entidad;
        this.fecha_caducidad = fecha_caducidad;
        this.cod_verificacion = cod_verificacion;
    }
    public long getNumTarjeta(){ // M�todo que devuelve el n�mero de la tarjeta de cr�dito
        return num_tarjeta;
    }
    public String getTitular(){ // M�todo que devuelve el titular de la tarjeta de cr�dito
        return titular;
    }
    public String getEntidad(){ // M�todo que devuelve la entidad de la tarjeta de cr�dito
        return entidad;
    }
    public Fecha getFechaCaducidad(){ // M�todo que devuelve la fecha de caducidad de la tarjeta de cr�dito
        return fecha_caducidad;
    }
    public int getCodVerificacion(){ // M�todo que devuelve el c�digo de verificaci�n de la tarjeta de cr�dito
        return cod_verificacion;
    }
    public String toString(){ // M�todo que devuelve un String con un resumen de los datos de la tarjeta de cr�dito
        return "Numero de tarjeta: " + num_tarjeta + "; Titular: " + titular + "; Entidad: " + entidad 
                + "; Fecha de caducidad: " + fecha_caducidad.getFecha() + "; Codigo de verificacion: " + cod_verificacion;
    }
            
}
