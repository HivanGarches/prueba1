package modelo;

import utilidades.Lector;

public class Punto {
	
	public int x,y;
	
	public Punto(){
	
	}
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	public boolean hay=false;
	
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x=x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public void crearPunto(){
		
		System.out.println("Creador de Puntos");
		
		this.setX(Lector.leerInteger("Coordenada x :"));
		this.setY(Lector.leerInteger("Coordenada y :"));
		
		hay=true;
		
	}
	
	public void imprimirInforme(){
		if(hay==false){System.out.println("No hay punto, asegurese de crear un punto antes de crear un informe");
		
		}
		else{
		System.out.println(this.toString());
		}
	}
	
	public void calcularDistancia(Punto p){
		
		if(hay==false){
			System.out.println("No hay punto, asegurese de crear un punto antes de calcular la distancia");
		}
		else{
		System.out.println("Calculdor de distancia entre puntos");
		System.out.println("Punto 1: " + p);
		System.out.println("Punto 2: " + this);
		double calcx = Math.pow((p.getX()-this.getX()),2);
		double calcy = Math.pow((p.getY()-this.getY()),2);
		double dist = Math.sqrt(calcx+calcy);
		
		System.out.println("La distancia es: " + dist);
		}
	}
	
	public void calcularDisctanciaCentro(){
		
		if(hay==false){
			System.out.println("No hay punto, asegurese de crear un punto antes de calcular la distancia");
		}
		else{
		System.out.println("Calculador de distancia entre punto y centro");
		System.out.println("Punto :" + this);
		this.calcularDistancia(new Punto(0,0));
		}
	
	
	}
	
	

}
