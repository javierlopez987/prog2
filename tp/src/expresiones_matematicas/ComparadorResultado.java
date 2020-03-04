package expresiones_matematicas;

import java.util.Comparator;

public class ComparadorResultado implements Comparator<Elemento>{
	
	public int compare(Elemento e1, Elemento e2) {
		return Float.compare(e1.getValor(), e2.getValor());
	}
}
