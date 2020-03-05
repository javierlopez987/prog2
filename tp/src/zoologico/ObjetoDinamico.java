package zoologico;

import java.util.HashMap;
import java.util.Map;

public abstract class ObjetoDinamico {
	Map<String, Comparable<Object>> atributos;
	
	public ObjetoDinamico() { 
		atributos = new HashMap<>();
	}
	
	public void addAtributo(String clave, Comparable<Object> valor) {
		atributos.put(clave, valor);
	}
	
	public Comparable<Object> get(String clave) {
		return atributos.get(clave);
	}
}
