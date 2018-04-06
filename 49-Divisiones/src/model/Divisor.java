package model;

import java.lang.IndexOutOfBoundsException;

import org.omg.CORBA.ExceptionList;

import utiles.Recolector;

public class Divisor {
	
	
		public int dividido,dividendo;
		public float resultado;
		
		public Divisor(){
			
		}
		
		public Divisor(int dividido,int dividendo){
			this.dividido=dividido;
			this.dividendo=dividendo;
		}

		public int getDividido() {
			return dividido;
		}

		public void setDividido(int dividido) {
			this.dividido = dividido;
		}

		public int getDividendo() {
			return dividendo;
		}

		public void setDividendo(int dividendo) {
			this.dividendo = dividendo;
		}
		
		

		public void dividir(){
			 dividendo=Recolector.leerInt("Introduzca un dividendo y un divisor, del 0-10");
			dividido=Recolector.leerInt();
			if(dividendo!=0){
			try{
			 System.out.println("El resultado de la division es: " + dividido/dividendo);
			} catch(ArithmeticException e){
				System.out.println(e.toString());
				
			} catch(Exception e){
				System.out.println(e.toString());
			}
			
			System.out.println("hola");
			
			}else if(dividendo>10||dividendo<0){
				System.out.println("Numero por fuera de los limites de la aplicación. Apagando...");
				throw new IndexOutOfBoundsException ();
				
				
			}else if(dividido>10||dividido<0){
				System.out.println("Numero por fuera de los limites de la aplicación. Apagando...");
				throw new IndexOutOfBoundsException();
			}
		

		
			}
		}

