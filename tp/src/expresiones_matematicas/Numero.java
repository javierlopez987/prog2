package expresiones_matematicas;

import java.util.ArrayList;
import java.util.List;

public class Numero extends Elemento{
	float valor;
	
	public Numero(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}

	public List<Numero> getNumeros() {
		List<Numero> resultado = new ArrayList<Numero>();
		resultado.add(this);
		return resultado;
	}

	public List<String> getSimbolos() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	public String toString() {
		// TODO Auto-generated method stub
		return new Float(valor).toString();
	}
}
