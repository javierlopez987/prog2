package zoologico;

public class Animal extends ObjetoDinamico{
	Criterio acceso;
	
	public Animal(Criterio c) {
		super();
		acceso = c;
	}
	
	public boolean apto(Jaula j) {
		return acceso.cumple(j);
	}
}
