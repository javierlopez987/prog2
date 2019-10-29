package sistemaElectoral;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Voto extends ESE {
	Candidato voto;
	Integer dni;
	LocalDate fecha;
	
	public Voto(Integer dni) {
		this.dni = dni;
		voto = null;
		fecha = null;
	}
	
	public int contarVoto() {
		return 1;
	}
	
	public boolean equals(Object o) {
		Voto aux = (Voto) o;
		return this.getDni() == aux.getDni();
	}
	
	public void votar(Candidato x) {
		voto = x;
		fecha = LocalDate.now();
	}

	public Candidato getVoto() {
		return voto;
	}

	public Integer getDni() {
		return dni;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	@Override
	public Set<ESE> find(Condicion c) {
		Set<ESE> result = new HashSet<ESE>();
		if(c.cumple(this)) {
			result.add(this);
		}
		return result;
	}
}
