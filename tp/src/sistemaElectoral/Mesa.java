package sistemaElectoral;

import java.util.HashSet;
import java.util.Set;

public class Mesa extends ESE {
	Set<ESE> padron;
	Set<ESE> votantes;
	
	public Mesa() {
		padron = null;
		votantes = new HashSet<ESE>();
	}
	
	public Mesa(Set<ESE> padron) {
		this.padron = padron;
		votantes = new HashSet<ESE>();
	}
	
	public int contarVoto() {
		int sumaVotos = 0;
		for (ESE e: votantes) {
			sumaVotos += e.contarVoto();
		}
		return sumaVotos;
	}
	
	public int contarAptosAVotar() {
		int sumaAptosAVotar = 0;
		for (ESE e: padron) {
			sumaAptosAVotar += e.contarAptosAVotar();
		}
		return sumaAptosAVotar;
	}
	
	public void registrarVoto(ESE v) {
		if(this.seEncuentra(v)) {
			votantes.add(v);
		}
	}
	
	public boolean seEncuentra(ESE v) {
		return padron.contains(v);
	}

	public Set<ESE> getPadron() {
		return padron;
	}

	public Set<ESE> getVotantes() {
		return votantes;
	}

	public void addPadron(Set<ESE> padron) {
		this.padron = padron;
	}

	public void addVotantes(ESE votante) {
		this.votantes.add(votante);
	}
	
	
	
}
