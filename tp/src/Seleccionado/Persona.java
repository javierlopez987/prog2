package Seleccionado;
import java.time.LocalDate;

public class Persona {
	LocalDate fna;
	String nombre, apellido, roll, estado;
	int nropasaporte;
	
	public Persona(LocalDate f, String n, String a, int p) {
		fna=f;
		nombre=n;
		apellido=a;
		roll="indeterminado";
		estado="indeterminado";
		nropasaporte=p;
	}
	
	public LocalDate getFna() {
		return fna;
	}

	public void setFna(LocalDate fna) {
		this.fna = fna;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNropasaporte() {
		return nropasaporte;
	}

	public void setNropasaporte(int nropasaporte) {
		this.nropasaporte = nropasaporte;
	}

	public void setFutbolista() {
		roll="futbolista";
	}
	public void setEntrenador() {
		roll="entrenador";
	}
	public void setMasajista() {
		roll="masajista";
	}
	public void setViajando() {
		estado="viajando";
	}
	public void setPaisOrig() {
		estado="pais de origen";
	}
	public void setConcentracion() {
		estado="concentrado";
	}
	
	public void isDisponible() {
		if(getEstado()=="pais de origen") {
			System.out.println("Dispoble");
		}
			
		else System.out.println("No disponible");
			
		
			
	
	}
  

}
