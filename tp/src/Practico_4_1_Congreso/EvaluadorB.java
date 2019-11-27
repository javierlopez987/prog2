package Practico_4_1_Congreso;
import java.util.ArrayList;
public class EvaluadorB {
		String nombre;
		ArrayList <String> temas;
		ArrayList <Trabajo> trabajos;


		public EvaluadorB(String e) {
			nombre= e;
			temas=new ArrayList<String>();
			trabajos=new ArrayList<Trabajo>();
			
		}
		
		public String getNombre() {
			return nombre;
		}

		public boolean conoce(String t) {
			return temas.contains(t);
		}
		
		public boolean Apto_trabajo(Trabajo t) {
			return t.AptoEvaluador(this);
		}

		
		public void addTema(String tema) {
			temas.add(tema);
		}

		public void addTrabajo(Trabajo t) {
			trabajos.add(t);
		}
		
		public boolean tiene(Trabajo t) {
			return trabajos.contains(t);
		}
		
		public int getCantTrabajos() {
			return trabajos.size();
		}
		
}
