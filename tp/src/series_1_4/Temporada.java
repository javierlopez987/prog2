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

	public int getEpisodiosVistos() {
		int cantVistos = 0;
		for (int i = 0; i < episodios.size(); i++) {
			if(episodios.get(i).isVisto()) {
				cantVistos++;		
			}
		}
		return cantVistos;
	}

	public int getEpisodiosVistos_2() {
		int cantVistos = 0;
		for(Episodio e: episodios) { // forEach
			if(e.isVisto()) {
				cantVistos++;
			}
		}
		return cantVistos;
	}

	public double getPromCalif() {
		double sumaCalif = 0;
		int episodiosCalificados = 0;
		for(Episodio e: episodios)
			if (e.getCalificacion() > 0) {
				sumaCalif += e.getCalificacion();
				episodiosCalificados++;
			}
		return sumaCalif / episodiosCalificados;
	}
}
