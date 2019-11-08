package Parcial;

public class FiltroNot implements Filtro {
	Filtro f1;
	
	public FiltroNot(Filtro ff1) {
		f1=ff1;
	}
	
	public boolean Cumple(Comarca c) {
		return !f1.Cumple(c);
	}

}
