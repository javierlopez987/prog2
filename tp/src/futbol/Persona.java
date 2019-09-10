package futbol;
import java.time.LocalDate;

public class Persona {
	final String ORIGEN = "En país de origen";
	final String CONCENTRADO = "En concentración";
	final String VIAJE = "Viajando";
	final String FUTBOLISTA = "Futbolista";
	final String ENTRENADOR = "Entrenador";
	final String MASAJISTA = "Masajista";
	String nombre;
	String apellido;
	int pasaporte;
	LocalDate nac;
	String rol;
	String estado;
	
	public Persona(String n, String a, int p, LocalDate f) {
		nombre = n;
		apellido = a;
		pasaporte = p;
		nac = f;
		rol = "Indeterminado";
		estado = "Intederminado";
	}
	
	public void setRolFutbolista() {
		rol = FUTBOLISTA;
	}
	
	public void setRolEntrenador() {
		rol = ENTRENADOR;
	}
	
	public void setRolMasajista() {
		rol = MASAJISTA;
	}
	
	public void setEstadoViajando() {
		estado = VIAJE;
	}
	
	public void setEstadoEnConcentracion() {
		estado = CONCENTRADO;
	}
	
	public void setEstadoPaisOrigen() {
		estado = ORIGEN;
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

	public int getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}

	public LocalDate getNac() {
		return nac;
	}

	public void setNac(LocalDate nac) {
		this.nac = nac;
	}

	public String getRol() {
		return rol;
	}

	public String getEstado() {
		return estado;
	}
	
	public boolean isDisponible() {
		return (getEstado() == ORIGEN);
	}
}
