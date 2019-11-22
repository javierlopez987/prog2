package Recuperatorio_Prog2;

public class CriterioCiudad implements Criterio {
String ciudad;

	public CriterioCiudad(String c) {
		ciudad=c;
	}
	public boolean cumple(Paquete_Carta pc) {
		return ciudad.equals(pc.getDestinatario().getCiudad());
		
	}

}
