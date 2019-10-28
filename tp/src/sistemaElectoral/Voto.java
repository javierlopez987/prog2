package sistemaElectoral;

import java.time.LocalDate;

public class Voto extends ESE {
	Candidato voto;
	int dni;
	LocalDate fecha;
	
	public Voto(int dni) {
		this.dni = dni;
		voto = null;
		fecha = null;
	}
	
	public int contarVoto() {
		return 1;
	}
	
	public int contarAptosAVotar() {
		return 1;
	}
	
	public boolean equals(Object o) {
		Voto voto = (Voto) o;
		return this.getDni() == voto.getDni();
	}
	
	public void votar(Candidato x) {
		voto = x;
		fecha = LocalDate.now();
	}

	public Candidato getVoto() {
		return voto;
	}

	public int getDni() {
		return dni;
	}

	public LocalDate getFecha() {
		return fecha;
	}
}
