package expresiones_matematicas;

import java.util.List;

public abstract class Elemento {
	float error;
	
	public abstract float getValor();
	
	public abstract List<Numero> getNumeros();
	
	public abstract List<String> getSimbolos();
	
	public abstract String toString();
	
	public void setError(float error) {
		this.error = error;
	}
}
