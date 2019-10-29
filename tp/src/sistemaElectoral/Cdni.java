package sistemaElectoral;

public class Cdni extends Condicion{
	private Integer dni;
	
	public Cdni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public boolean cumple(Voto v) {
		return v.getDni().equals(dni);
	}
}
