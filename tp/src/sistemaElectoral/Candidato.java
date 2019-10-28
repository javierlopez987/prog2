package sistemaElectoral;

public class Candidato {
	String nombre;
	String apellido;
	String partidoPolitico;
	String agrupacion;
	
	public Candidato(String n, String apellido, String partidoPolitico, String agrupacion) {
		this.nombre = n;
		this.apellido = apellido;
		this.partidoPolitico = partidoPolitico;
		this.agrupacion = agrupacion;
	}

	@Override
	public String toString() {
		return "Candidato [partidoPolitico=" + partidoPolitico + ", agrupacion=" + agrupacion + ", nombre=" + nombre
				+ ", apellido=" + apellido + "]";
	}
	
	
}
