package Recuperatorio_Prog2;

public class CriterioRemitente implements Criterio {
String nombre;
	public CriterioRemitente(String n) {
		nombre=n;
	}
	@Override
	public boolean cumple(Envio e) {
		return nombre.equals(e.getRemitente().getNombre());
	}

}
