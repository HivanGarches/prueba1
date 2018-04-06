package modelo;

import utilidades.Recolector;

public class Asignatura {

	private String nombreA;
	private int codigoA, cursoA;

	public String getNombre() {
		return nombreA;
	}

	public void setNombreA(String nombreA) {

		this.nombreA = nombreA;
	}

	public int getCodigoaA() {
		return codigoA;

	}

	public void setCodigoA() {
		this.codigoA = codigoA;
	}

	public int getCursoA() {
		return cursoA;
	}

	public void setCursoA() {
		this.cursoA = cursoA;
	}

	public void crearAsignatura() {
		System.out.println("indique un nombre");
		this.setNombreA(Recolector.leerString());
	}
}
