package CentrodeComputos_ej5pract4;

	
public class Computadoras  implements Comparable<Computadoras>{
Double velocidad;

@Override
public int compareTo(Computadoras c1) {
	
	return Double.compare(this.getvelocidad(), c1.getvelocidad());
}


public double getvelocidad() {
	return velocidad;
}




}
