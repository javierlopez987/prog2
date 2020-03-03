package expresiones_matematicas;

public class Suma extends Expresion{
	
	public Suma(Elemento e1, Elemento e2) {
		super(e1, e2);
		this.operador = new String("+");
	}
	
	public float getValor() {
		return e1.getValor() + e2.getValor();
	}
}
