package expresiones_matematicas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sistema implements Iterable<Elemento>{
	List<Elemento> exp_mat;
	
	public Sistema() {
		exp_mat = new ArrayList<>();
	}
	
	public void add(Elemento e) {
		exp_mat.add(e);
	}
	
	public List<Elemento> listarOrdenado(Comparator<Elemento> c) {
		List<Elemento> resultado = new ArrayList<>();
		resultado = exp_mat;
		resultado.sort(c);
		return resultado;
		
	}
	
	public Iterator<Elemento> iterator() {
		return exp_mat.iterator();
	}
	
}
