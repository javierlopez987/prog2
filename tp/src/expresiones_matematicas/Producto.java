package expresiones_matematicas;

public class Producto extends Expresion{
	
	public Producto(Elemento e1, Elemento e2) {
		super(e1, e2);
		this.operador = new String("*");
	}
	
	public float getValor() {
		return e1.getValor() * e2.getValor();
	}
}
