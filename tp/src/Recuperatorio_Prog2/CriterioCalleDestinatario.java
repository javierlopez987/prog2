package Recuperatorio_Prog2;

public class CriterioCalleDestinatario  implements Criterio{
String calle;

	public CriterioCalleDestinatario(String ca) {
		calle=ca;
	}
	
	public boolean cumple(Paquete_Carta p) {
		return calle.equals(p.getDestinatario().calle);
	}
}
