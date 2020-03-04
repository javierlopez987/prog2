package expresiones_matematicas;

import java.util.Comparator;

public class ComparadorCantOperadores implements Comparator<Elemento>{

	public int compare(Elemento e1, Elemento e2) {
		return Integer.compare(e1.getCantOperadores(), e2.getCantOperadores());
	}
}
