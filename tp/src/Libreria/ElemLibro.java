package Libreria;
import java.util.ArrayList;
public abstract class ElemLibro {
	ArrayList<String>generos;
	
	public ElemLibro() {
		generos=new ArrayList<String>();
	}

	public ArrayList<String> getGeneros() {
		return generos;
	}

	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}
	public void addGenero(String g) {
		this.generos.add(g);
	}

	@Override
	public String toString() {
		return "ElemLibro [generos=" + generos + "]";
	}

	
	

}
