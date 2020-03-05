package zoologico;

import java.util.ArrayList;
import java.util.List;

public class sistema_zoo {
	List<Jaula> jaulas;
	List<Animal> animales;
	
	public sistema_zoo() {
		jaulas = new ArrayList<>();
		animales = new ArrayList<>();
	}
	
	public void addJaula(Jaula j) {
		jaulas.add(j);
	}
	
	public void addAnimal(Animal a) {
		animales.add(a);
	}
	
	public List<Jaula> getJaulas(Animal a) {
		List<Jaula> resultado = new ArrayList<>();
		for(Jaula j: jaulas) {
			if(j.apto(a)) {
				resultado.add(j);
			}
		}
		return resultado;
	}
	
	public List<Animal> getAnimales(Jaula j) {
		List<Animal> resultado = new ArrayList<>();
		for(Animal a: animales) {
			if(a.apto(j)) {
				resultado.add(a);
			}
		}
		return resultado;
	}
}
