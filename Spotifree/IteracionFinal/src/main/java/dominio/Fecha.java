package dominio;

	public class Fecha {
	    private int dia;
	    private int mes;
	    private int anio;
	    
	    public Fecha(final int dia,final int mes,final int anio){
	    	this.dia = dia;
	    	this.mes = mes;
	    	this.anio = anio;
	    }
	    public int getDia(){
	        return dia;
	    }
	    public int getMes(){
	    	return mes;
	    }
	    public int getAnio(){
	        return anio;
	    }

	    public String getFecha(){
	        return getDia() + "/" + getMes() + "/" + getAnio();
	    }
	    public String getFechaCorta(){
	        return getMes() + "/" + getAnio();
	    }
	}
