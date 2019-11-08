package Parcial;

public class FiltroDensidad implements Filtro {
	double densidad;
	
		public FiltroDensidad(double d) {
			densidad=d;
		}
		public boolean Cumple(Comarca c) {
			return c.getDensidad()>densidad;
		}

	
}
