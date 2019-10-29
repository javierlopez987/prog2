package sistemaElectoral;

public class CondOR extends Condicion{
	Condicion c1;
	Condicion c2;
	
	public CondOR(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(Voto v) {
		return c1.cumple(v) || c2.cumple(v);
	}
}
