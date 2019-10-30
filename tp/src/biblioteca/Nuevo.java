package biblioteca;

import java.util.Date;

public class Nuevo extends Libro{
	Date diaPrestamo;

	public Nuevo(String titulo, String autor) {
		super(titulo, autor);
	}

	public Date getDiaPrestamo() {
		return diaPrestamo;
	}

	public void setDiaPrestamo(Date diaPrestamo) {
		this.diaPrestamo = diaPrestamo;
	}

	@Override
	public Libro prestarse() {
		//Incompleto
		return null;
	}
	
}
