package Recuperatorio_Prog2;

public class CriterioAND implements Criterio{
	Criterio c1;
	Criterio c2;
	
	public CriterioAND( Criterio cc1, Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	public boolean cumple(Envio e) {
		return c1.cumple(e) && c2.cumple(e);
	}

}
