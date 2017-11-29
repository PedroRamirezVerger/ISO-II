package dominio;

public class Cancion {

	private double duracion;
	private int id;
	private String nombre;
	private String estilo;
	private String artista;
	private Album album;
	private double precio;
	private Cancion me = new Cancion(duracion, id, nombre, estilo, artista, album, precio);

	public Cancion(double duracion, int id, String nombre, String estilo, String artista, Album album, double precio) {
		super();
		this.duracion = duracion;
		this.id = id;
		this.nombre = nombre;
		this.estilo = estilo;
		this.artista = artista;
		this.album = album;
		this.precio = precio;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
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

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
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

	public int buscarcancion(String nombre) {
		int encontrado=0;
		if (this.nombre == nombre) {
			encontrado=1;
		} 
		return encontrado;
	}
}
