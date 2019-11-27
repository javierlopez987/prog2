package CentrodeComputos_ej5pract4;
import java.util.ArrayList;

public class Cola {
	ArrayList<Comparable>Elementos;
	
	
	public void insertarOrd(Comparable e) {
		
		for (Comparable otro: Elementos) {
			if (e.compareTo(otro)==1){
				Elementos.add(e);
			}	
	}
}
	
	public void agregar () {
		
	}
	
	public void borrar() {
		
	}
	

}
