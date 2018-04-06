package control;

import modelo.Punto;

public class Test {
	
		public static void test1(){

		  
		        Punto p = new Punto();
		        Punto p1 = new Punto();
		        p.crearPunto();
		        p1.crearPunto();
		        p.imprimirInforme();
		        p1.imprimirInforme();
		        p.calcularDistancia(p1);
		        
		        p.calcularDisctanciaCentro();
		        
		    }
		}


