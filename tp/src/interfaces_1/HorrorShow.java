package interfaces_1;

public class HorrorShow {
	public HorrorShow() {}
	
	public void asustar(Monstruo m) {
		m.asustar();
	}
	
	public void liquida(MonstruoLetal l) {
		l.matar();
	}
	
	public void asustaMas(MonstruoPeligroso m) {
		m.asustar();
		m.destruir();
	}
}
