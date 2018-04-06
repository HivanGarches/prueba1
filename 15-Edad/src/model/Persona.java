package model;

import utilidades.Lector;
public class Persona {
	
	public int edad;
	boolean compro=false;
	public Persona(){
		
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	public int getEdad(){
		return edad;
	}
	
	public void pedirEdad(){
	
		
		this.setEdad(Lector.leerInteger("Comprobador de rango de edad, por favor introduzca su edad."));
	}
	

	public void comprobarEdad(){
		
				do{
					
		if(this.edad>=0||this.edad<=4){
			System.out.println("Pequeñin");
			compro=true;
		}
		else if(this.edad>=5||this.edad<=10){
			System.out.println("Niño");
			compro=true;
		}
		else if(this.edad>=11||this.edad<=40){
			System.out.println("Adulto");
			compro=true;
		}
		else if(this.edad>=41||this.edad<=80){
			System.out.println("Talludito");
			compro=true;
		}
		else{
			System.out.println("Introduzca un caracter numerico entre 0-80 para ser valido");
		}
				} while(compro==false);
	}
	

}
