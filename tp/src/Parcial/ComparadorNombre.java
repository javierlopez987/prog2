package Parcial;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Comarca> {

	@Override
	public int compare(Comarca c1, Comarca c2) {
		return c1.compareTo(c2);
	}

}
