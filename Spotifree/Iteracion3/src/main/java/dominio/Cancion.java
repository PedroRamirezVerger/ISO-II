package dominio;

public class Cancion {

	private double duracion;
	private int id;
	private String nombre;
	private String estilo;
	private Artista artista;
	private Album album;
	private double precio;
	private Cancion me = new Cancion(duracion, id, nombre, estilo, artista, album, precio);

	public Cancion(double duracion, int id, String nombre, String estilo, Artista artista2, Album album, double precio) {
		super();
		this.duracion = duracion;
		this.id = id;
		this.nombre = nombre;
		this.estilo = estilo;
		this.artista = artista2;
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

	public int buscarcancion(int id) {
		int encontrado=0;
		if (this.id == id) {
			encontrado=1;
		} 
		return encontrado;
	}
	public void borrar(){
		me.setAlbum(null);
		me.setArtista(null);
		me.setDuracion(0);
		me.setEstilo(null);
		me.setId(0);
		me.setNombre(null);
		me.setPrecio(0);
	}
}
