package zoologico;

public class CriterioMayor implements Criterio{
	Object limite;
	String atributo;
	
	public CriterioMayor(Object valor, String atributo) {
		limite = valor;
		this.atributo = atributo;
	}
	
	public boolean cumple(ObjetoDinamico a) {
		return a.get(atributo).compareTo(limite) > 0;
	}
}
