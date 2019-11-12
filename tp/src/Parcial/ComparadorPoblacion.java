package Parcial;

import java.util.Comparator;

public class ComparadorPoblacion implements Comparator<Comarca> {

	@Override
	public int compare(Comarca arg0, Comarca arg1) {
		return Integer.compare(arg0.getHabitantes(), arg1.getHabitantes());
	}
	
	

}
