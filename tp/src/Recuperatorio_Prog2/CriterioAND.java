package Recuperatorio_Prog2;

public class CriterioAND implements Criterio{
	Criterio c1;
	Criterio c2;
	
	public CriterioAND( Criterio cc1, Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	public boolean cumple(Paquete_Carta pc) {
		return c1.cumple(pc) && c2.cumple(pc);
	}

}
