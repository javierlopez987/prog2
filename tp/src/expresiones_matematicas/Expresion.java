package expresiones_matematicas;

import java.util.ArrayList;
import java.util.List;

public abstract class Expresion extends Elemento {
	Elemento e1;
	Elemento e2;
	String operador;
	
	public Expresion (Elemento e1, Elemento e2) {
		this.e1 = e1;
		this.e2 = e2;
	}	
	
	public String toString() {
		return new String("("+e1+operador+e2+")");
	}
	
	public List<Numero> getNumeros() {
		List<Numero> resultado = new ArrayList<Numero>();
		resultado.addAll(e1.getNumeros());
		resultado.addAll(e2.getNumeros());
		return resultado;
	}
	
	public List<String> getSimbolos() {
		List<String> resultado = new ArrayList<>();
		resultado.addAll(e1.getSimbolos());
		resultado.addAll(e2.getSimbolos());
		resultado.add(operador);
		return resultado;
	}
}
