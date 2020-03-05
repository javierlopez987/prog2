package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Jaula extends ObjetoDinamico{
	List<Jaula> vecinas;
	
	public Jaula() {
		super();
		vecinas = new ArrayList<>();
	}
	
	public boolean apto(Animal a) {
		return a.apto(this);
	}
}
