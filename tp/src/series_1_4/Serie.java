package series_1_4;
import java.util.ArrayList;

public class Serie {
	String titulo;
	String description;
	String creador;
	String genero;
	ArrayList<Temporada> temporadas; 
	
	public Serie () {
		titulo = "Desconocido";
		description = "Desconocido";
		creador = "Desconocido";
		genero = "Indeterminado";
		temporadas = new ArrayList<Temporada>();
	}
	
	public Serie (String t, String d, String c, String g) {
		temporadas = new ArrayList<Temporada>();
	}
	
	public boolean addTemporada (Temporada t) {
		return temporadas.add(t);
	}
	
	public int getCantTemporadas () {
		return temporadas.size();
	}
	
	public int getCantVistos() {
		int cantVistos = 0;
		for(Temporada t: temporadas) { // forEach
			cantVistos += t.getEpisodiosVistos_2();
		}
		return cantVistos;
	}
}
