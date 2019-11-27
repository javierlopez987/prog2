package Recuperatorio_Prog2;


public class CriterioPeso implements Criterio {
double peso;
			
public CriterioPeso(double p) {
				peso=p;
			}
			
			public boolean cumple(Envio e) {
				return e.getPeso()<=peso;
				
			}

}
