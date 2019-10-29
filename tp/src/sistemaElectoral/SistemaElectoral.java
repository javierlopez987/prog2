package sistemaElectoral;
import java.util.Set;
import java.util.HashSet;

public class SistemaElectoral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mesa mesa1 = new Mesa();
		Mesa mesa2 = new Mesa();
		
		Candidato candidato1 = new Candidato("alberto", "fernandez", "frente de todos", "NN");
		Candidato candidato2 = new Candidato("mauricio", "macri", "cambiemos", "nn");
		Candidato candidato3 = new Candidato("luis", "centurion", "social", "Nn");
		Candidato candidato4 = null;
		
		Voto votante1 = new Voto(1);
		Voto votante2 = new Voto(2);
		Voto votante3 = new Voto(3);
		Voto votante4 = new Voto(4);
		Voto votante5 = new Voto(5);
		Voto votante6 = new Voto(6);
		Voto votante7 = new Voto(7);
		Voto votante8 = new Voto(8);
		Voto votante9 = new Voto(9);
		Voto votante10 = new Voto(10);
		
		mesa1.add(votante1);
		mesa1.add(votante2);
		mesa1.add(votante3);
		mesa1.add(votante4);
		mesa1.add(votante5);
		mesa1.add(votante6);
		mesa1.add(votante7);
		mesa2.add(votante6);
		mesa2.add(votante7);
		mesa2.add(votante8);
		mesa2.add(votante9);
		mesa2.add(votante10);
		
		votante1.votar(candidato1);
		votante2.votar(candidato2);
		votante3.votar(candidato3);
		votante4.votar(candidato1);
		votante5.votar(candidato1);
		votante6.votar(candidato1);
		votante7.votar(candidato2);
		votante8.votar(candidato3);
		votante9.votar(candidato3);
		votante10.votar(candidato4);
		Cdni c1 = new Cdni(1);
		Set<ESE> votante = mesa1.find(c1);
		Voto v1 = (Voto) votante;
		v1.votar(candidato1);
		
		System.out.println(mesa1.contarVoto());
		System.out.println(mesa2.contarVoto());
		
		System.out.println(candidato1);
		System.out.println(candidato2);
		System.out.println(candidato3);
		
	}

}
