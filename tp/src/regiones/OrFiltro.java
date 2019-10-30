package regiones;

public class OrFiltro extends Filtro{
	Filtro f1;
	Filtro f2;
	
	public OrFiltro(Filtro f1, Filtro f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean cumple(Ciudad c) {
		return f1.cumple(c) || f2.cumple(c);
	}
}
