package control;

import modelo.Asignatura;

import modelo.Carrera;

public class Test {
	
	
		public static void test(){
			Carrera c1 = new Carrera();
			Asignatura a1 = new Asignatura();
			
			a1.setNombreA("Java");
			c1.setNombreC("informatica");
			
			c1.setAsignatura(a1);
			
			System.out.println(c1);
			
		}

}
