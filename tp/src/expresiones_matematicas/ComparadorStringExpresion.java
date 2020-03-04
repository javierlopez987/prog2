package expresiones_matematicas;

public class ComparadorStringExpresion implements Comparador{
	
	public int compare(Elemento e1, Elemento e2) {
		return e1.toString().compareTo(e2.toString());
	}
}
