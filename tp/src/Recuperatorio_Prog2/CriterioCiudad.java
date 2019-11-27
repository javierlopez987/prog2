package Recuperatorio_Prog2;

public class CriterioCiudad implements Criterio {
String ciudad;

	public CriterioCiudad(String c) {
		ciudad=c;
	}
	public boolean cumple(Envio e) {
		return ciudad.equals(e.getDestinatario().getCiudad());
		
	}

}
