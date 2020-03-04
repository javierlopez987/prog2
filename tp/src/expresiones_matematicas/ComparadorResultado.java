package expresiones_matematicas;

public class ComparadorResultado implements Comparador{
	
	public int compare(Elemento e1, Elemento e2) {
		return Float.compare(e1.getValor(), e2.getValor());
	}
}
