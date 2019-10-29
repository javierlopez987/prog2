package sistemaElectoral;

import java.util.Set;

public abstract class ESE {
	
	public abstract int contarVoto();
	public abstract Set<ESE> find(Condicion c);
}
