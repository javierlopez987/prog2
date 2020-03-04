package expresiones_matematicas;

import java.util.Comparator;

public class ComparadorStringExpresion implements Comparator<Elemento>{
	
	public int compare(Elemento e1, Elemento e2) {
		return e1.toString().compareTo(e2.toString());
	}
}
