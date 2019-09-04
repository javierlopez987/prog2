package series_1_4;
import java.util.ArrayList;

public class Serie {
	String titulo;
	String description;
	String creador;
	String genero;
	ArrayList<Temporada> temporadas; 
	
	public Serie (String t, String d, String c, String g) {
		temporadas = new ArrayList<Temporada>();
	}
	
	public boolean addTemporada (Temporada t) {
		return temporadas.add(t);
	}
	
	public int getCantTemporadas () {
		return temporadas.size();
	}
}
