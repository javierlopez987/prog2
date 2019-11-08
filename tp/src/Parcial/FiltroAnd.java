package Parcial;

public class FiltroAnd implements Filtro {
	Filtro f1;
	Filtro f2;
	public FiltroAnd(Filtro ff1, Filtro ff2) {
		f1=ff1;
		f2=ff2;
	}
	public boolean Cumple(Comarca c) {
		return f1.Cumple(c)&&f2.Cumple(c);
	}

}
