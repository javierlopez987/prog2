package Sueldos;

import java.util.Vector;

public class Empresa {

	public static void main(String[] args) {
		Vector<Empleado>empleados;
		
		empleados= new Vector<Empleado>();
		
		Empleado e1=new Empleado("Juan",1,12000);
		Empleado e2=new Comision("Juan",2,12000,500);
		Empleado e3=new Extra("Maxi",3,12000,4);
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		
		
		for(Empleado e: empleados) {
			e.getSueldo();
			System.out.println("Sueldo:"+e.getSueldo());
		}
	}

}
