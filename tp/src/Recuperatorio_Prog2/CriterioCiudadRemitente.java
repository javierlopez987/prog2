package Recuperatorio_Prog2;

public class CriterioCiudadRemitente implements Criterio{
	String ciudadR;
	
	public CriterioCiudadRemitente(String ciu) {
		ciudadR=ciu;
	}
	
	public boolean cumple(Envio pc) {
		return ciudadR.equals(pc.getRemitente().ciudad);
	}

}
