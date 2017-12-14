package dominio;

public class Cancion {

	private String duracion;
	private int id;
	private String nombre;
	private String estilo;
	private Artista artista;
	private Album album;
	private double precio;
	

	public Cancion(String duracion2, int id, String nombre, String estilo, Artista artista2, Album album, double precio) {
		super();
		this.duracion = duracion2;
		this.id = id;
		this.nombre = nombre;
		this.estilo = estilo;
		this.artista = artista2;
		this.album = album;
		this.precio = precio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion2) {
		this.duracion = duracion2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
}
