package Parcialito2;

public class Main {

	
	public static void main(String[] args) {
		
		General a = new General();
		General b = new SegundoNivelA();
		General c = new PrimerNivelB();
		
		a.metUno();
		a.metDos();
		a.metValor();

		b.metUno();
		b.metDos();
		b.metValor();
		//b.metTres();
		
		c.metUno();
		c.metDos();
		c.metValor();
		//c.metCinco();
		
		a = b;
		b = c;
		
		((SegundoNivelA)a).metTres();
		//((SegundoNivelA)b).metTres(); No se puede castear a SegundoNivelA
		//((SegundoNivelA)c).metTres(); No se puede castear a SegundoNivelA
		
		PrimerNivelA pA = new PrimerNivelA();
		pA.metUno();
		pA.metDos();
		pA.metTres();
		pA.metValor();
		
		PrimerNivelB pB = new PrimerNivelB();
		pB.metUno();
		pB.metDos();
		pB.metCinco();
		pB.metValor();
		
		SegundoNivelA sA = new SegundoNivelA();
		sA.metUno();
		sA.metDos();
		sA.metTres();
		sA.metCuatro();
		sA.metValor();
		((PrimerNivelA)sA).metUno();
		
		SegundoNivelB sB = new SegundoNivelB();
		sB.metUno();
		sB.metDos();
		sB.metCinco();
		sB.metValor();
		((PrimerNivelB)sB).metUno();
		
		a=sB;
	//	sB = b;
		
		
	}
}
