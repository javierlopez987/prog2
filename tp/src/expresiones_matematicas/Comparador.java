package expresiones_matematicas;

import java.util.Comparator;

public interface Comparador extends Comparator<Elemento> {
	int compare(Elemento e1, Elemento e2);
}
