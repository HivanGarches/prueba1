package control;

import utilidades.Lector;
import utilidades.Sumatorio;

public class Test {
	
	
		public static void prueba(){
			int num;
			
			num=Lector.leerInteger("Introduce un numero");
			
			
			System.out.println("Suma los pares del numero que pongas como cantidad tope: " + Sumatorio.sumadorTope(num));
			
			
		}
		public static void prueba2(){
			int num;
			
			num=Lector.leerInteger("Introduce un numero");
			
			
			System.out.println("Suma X primeros numeros pares :" + Sumatorio.sumarX(num));
			
		}

}
