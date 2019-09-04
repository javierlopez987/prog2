package series_1_4;

public class Episodio {
	String titulo;
	String descripcion;
	boolean visto;
	int calificacion;
	final static int min_calif = 1;
	final static int max_calif = 5;

	public Episodio () {
		titulo = "Episodio sin título";
		descripcion = "Descripción";
		visto = false;
		calificacion = -1;
	}

	public boolean isVisto() {
		return visto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		if((calificacion >= min_calif) && (calificacion <= max_calif))
			this.calificacion = calificacion;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}


}
