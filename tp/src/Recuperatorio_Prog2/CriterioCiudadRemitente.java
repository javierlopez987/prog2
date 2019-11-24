package Recuperatorio_Prog2;

public class CriterioCiudadRemitente implements Criterio{
	String ciudadR;
	
	public CriterioCiudadRemitente(String ciu) {
		ciudadR=ciu;
	}
	
	public boolean cumple(Paquete_Carta pc) {
		return ciudadR.equals(pc.getRemitente().ciudad);
	}

}
