package biblioteca;

public abstract class Libro {
	String titulo;
	String autor;
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public abstract Libro prestarse();
}
