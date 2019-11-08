package Parcial;

public class FiltroOr implements Filtro {
	Filtro f1;
	Filtro f2;
	public FiltroOr(Filtro ff1, Filtro ff2) {
		f1=ff1;
		f2=ff2;
	}

	public boolean Cumple(Comarca c) {
		return f1.Cumple(c)||f2.Cumple(c);
	}

}
