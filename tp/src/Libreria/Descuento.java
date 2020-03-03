package Libreria;

public class Descuento {
	Filtro condicion;
	double porcentaje;
	
	public Descuento(Filtro condicion, double d) {
		this.condicion = condicion;
		this.porcentaje = d;
	}
	
	public void setCondicion(Filtro condicion) {
		this.condicion = condicion;
	}
	
	public double getDescuento(Clientela c) {
		if(condicion.cumple(c)) {
			return porcentaje;
		} else {
			return 0;
		}
	}
}
