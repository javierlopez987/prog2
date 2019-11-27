package SistemaBancario;

import java.util.ArrayList;

public class Cuenta {
	double cajaAhorro;
	int CBU;
	ArrayList<Operacion>operaciones;
	
	public Cuenta(double dinero, int C) {
		cajaAhorro=dinero;
		CBU=C;
		operaciones= new ArrayList<>();
	}

	public double getCajaAhorro() {
		return cajaAhorro;
	}

	public void setCajaAhorro(double cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}

	public int getCBU() {
		return CBU;
	}

	public void setCBU(int cBU) {
		CBU = cBU;
	}

	public ArrayList<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(ArrayList<Operacion> operaciones) {
		this.operaciones = operaciones;
	}
	
	
	

}
