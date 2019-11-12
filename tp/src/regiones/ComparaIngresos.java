package regiones;

import java.util.Comparator;

public class ComparaIngresos implements Comparator<Ciudad>{
	
	public int compare(Ciudad c1, Ciudad c2) {
		return Integer.compare(c1.getIngresos(), c2.getIngresos());
	}
}
