package Recuperatorio_Prog2;

public class CriterioRemitente implements Criterio {
String nombre;
	public CriterioRemitente(String n) {
		nombre=n;
	}
	@Override
	public boolean cumple(Paquete_Carta pc) {
		return nombre.equals(pc.getRemitente().getNombre());
	}

}
