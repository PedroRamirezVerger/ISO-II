public class Cancion {
		private int id;
		private String nombre;
		private String estilo;
		private Artista artista;
		private Album album;
		private int duracion;
		private double precio;
		public Cancion(int id, String nombre, String estilo, Artista artista, Album album, int duracion,
				double precio) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.estilo = estilo;
			this.artista = artista;
			this.album = album;
			this.duracion = duracion;
			this.precio = precio;
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
		public int getDuracion() {
			return duracion;
		}
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}

		

	}
