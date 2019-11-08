package Parcial;

public class FiltroHab implements Filtro {
	int habitantes;
	public FiltroHab(int h) {
		habitantes=h;
	}
	public boolean Cumple(Comarca c) {
		return c.getHabitantes()>habitantes;
	}

}
