package regiones;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Ciudad>{
	
	public int compare(Ciudad c1, Ciudad c2) {
		return c1.compareTo(c2);
	}
}
