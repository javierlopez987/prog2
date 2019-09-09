package series_1_4;

public class CentroStreaming {

	public static void main(String[] args) {
		Serie s1 = new Serie();
		Temporada t1 = new Temporada(1);
		Episodio e1 = new Episodio();
		Episodio e2 = new Episodio();
		Episodio e3 = new Episodio();
		
		s1.addTemporada(t1);
		t1.addEpisodio(e1);
		t1.addEpisodio(e2);
		t1.addEpisodio(e3);
		
		System.out.println(s1.getCantTemporadas());
	}

}
