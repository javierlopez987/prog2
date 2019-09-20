package SeleccionFutbol;
import java.time.LocalDate;
public class Futbolista extends Integrante {
int posicion;
String pie_habil;
int cant_goles;


public Futbolista(String n,String a,int p,LocalDate f){
	super(n,a,p,f);
	posicion=0;
	pie_habil="der";
	cant_goles=0;
}

}