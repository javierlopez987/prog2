package Recuperatorio_Prog2;

public class Direccion {
	String nombre;
	String ciudad;
	String calle;
	int numero;
	
	public Direccion(String n, String ci, String ca, int nu) {
		nombre=n;
		ciudad=ci;
		calle=ca;
		numero=nu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
