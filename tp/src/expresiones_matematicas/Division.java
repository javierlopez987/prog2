package expresiones_matematicas;

public class Division extends Expresion{

	public Division(Elemento e1, Elemento e2) {
		super(e1, e2);
		this.operador = new String("/");
	}
	
	public float getValor() {
		if(e2.getValor() != 0) {
			return e1.getValor() / e2.getValor();
		}
		else {
			return this.error;
		}
	}
}
