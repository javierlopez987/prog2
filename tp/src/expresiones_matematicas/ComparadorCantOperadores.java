package expresiones_matematicas;

public class ComparadorCantOperadores implements Comparador{

	public int compare(Elemento e1, Elemento e2) {
		return Integer.compare(e1.getCantOperadores(), e2.getCantOperadores());
	}
}
