package modelo;

import utilidades.Recolector;
import modelo.Asignatura;

public class Carrera {
	public String nombreC;
	public int duracionC;
	
	private Asignatura a1 = new Asignatura();
	
	public void setNombreC(String nombreC){
		this.nombreC=nombreC;
	}
	public String getNombreC(){
		return nombreC;
	}
	
	public void setDuracionC(int duracionC){
		this.duracionC=duracionC;
	}
	public int getDuracionC(){
		return duracionC;
	}
	public void setAsignatura(Asignatura a12) {
		
		
	}
	
	
	

}
