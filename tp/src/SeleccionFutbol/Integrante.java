package SeleccionFutbol;
import java.time.LocalDate;
public class Integrante {
	String nombre;
	String apellido;
	int pasaporte;
	LocalDate nac;
	String rol;
	String estado;
	
	
	
	public Integrante(String n,String a,int p,LocalDate f){
		nombre=n;
		apellido=a;
		pasaporte=p;
		nac=f;
		rol="Indeterminado";
		estado="Indeterminado";
		
	}
	
	
	public void setRolfutbolista() {
		rol="Futbolista";
	}
	
	public void setRolentrenador() {
		rol="Entrenador";
	}
	
	public void setRolmasajista() {
		rol="Masajista";
	}
	
	public void setEstadoViaje() {
		estado="Viajando";
	}
	public void setEstadoconcentra() {
		estado="Concentracion";
	}
	
	public void setEstadopais() {
		estado="En pais de origen";
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


	public boolean Isdisponible() {
		if (getEstado()=="En pais de origen"){
				return true;
		}
		else return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
