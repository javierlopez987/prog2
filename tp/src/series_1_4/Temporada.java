package series_1_4;
import java.util.ArrayList;

public class Temporada {
	int nroTemporada;
	ArrayList<Episodio> episodios;
	
	public Temporada (int num) {
		nroTemporada = num;
		episodios = new ArrayList<Episodio>();
	}
	
	public void setNroTemporada (int num) {
		nroTemporada = num;
	}

	public boolean addEpisodio (Episodio e) {
		return episodios.add(e);
	}
	
	public int getCantEpisodios() {
		return episodios.size();
	}
}
