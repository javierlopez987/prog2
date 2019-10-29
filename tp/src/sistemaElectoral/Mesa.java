package sistemaElectoral;

import java.util.HashSet;
import java.util.Set;

public class Mesa extends ESE {
	Set<ESE> votantes;
	
	public Mesa() {
		votantes = new HashSet<ESE>();
	}
	
	public int contarVoto() {
		int sumaVotos = 0;
		for (ESE e: votantes) {
			sumaVotos += e.contarVoto();
		}
		return sumaVotos;
	}
	
	public Set<ESE> getVotantes() {
		return votantes;
	}

	public void add(Voto votante) {
		votantes.add(votante);
	}
	
	public Set<ESE> find(Condicion c) {
		Set<ESE> result = new HashSet<ESE>();
		for(ESE v: votantes) {
			result.addAll(v.find(c));
		}
		return result;
	}
}
