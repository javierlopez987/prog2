package Recuperatorio_Prog2;

public class CriterioOR implements Criterio{
	Criterio c1;
	Criterio c2;
	
	public CriterioOR(Criterio cc1, Criterio cc2) {
		c1=cc1;
		c2=cc2;
	}
	
	public boolean cumple(Envio pc) {
		return c1.cumple(pc)|| c2.cumple(pc);
	}

}
