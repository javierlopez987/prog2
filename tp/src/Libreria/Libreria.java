package Libreria;

import java.util.ArrayList;

public class Libreria {
	ArrayList<CriterioDescuento>descuentos;
	
		public Libreria() {
			descuentos=new ArrayList<>();
		}
		
public void addCriterio(CriterioDescuento cd) {
	descuentos.add(cd);
}

public int getDescuento(Clientela c) {
	int otro=0, mayor=0;
	for(CriterioDescuento cd: descuentos) {
		if(cd.cumple(c)) {
			otro=cd.getDescuento();
			if(otro>mayor) {
				mayor=otro;
			}
		}
	}
		return mayor;
		
}

}
