package CentrodeComputos_ej5pract4;

public class Procesos implements Comparable<Procesos> {
double req_memoria;



public int compareTo(Procesos p1) {
	return Double.compare(this.getreq_memoria(), p1.getreq_memoria());
}

public double getreq_memoria() {
	return req_memoria;
}














}
