package figuras;

public class Figura {
	String nombre;

	public Figura() {
		nombre = "Desconocido";
	}

	public Figura(String n) {
		nombre = n;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getArea() {
		return 0.0;
	}
}
