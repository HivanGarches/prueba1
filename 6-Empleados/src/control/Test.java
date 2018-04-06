package control;

import model.Empleado;
import model.Departamento;
import model.Director;

public class Test {
		
	
	public static void prueba(){
		Empleado emp1 = new Empleado("Ayvan","Garches", "Atalaya del arcipreste1", 666666666);
		Empleado emp2 = new Empleado("Vani","Cesgar", "Atalaya del arcipreste1", 145874554);
		Departamento dep1 = new Departamento("Informatica", "Planta2", 121212121);
		Director dire1 = new Director (emp1,dep1);
		emp1.setDep(dep1);
		System.out.println(dep1);
		System.out.println(emp1);
		
		
	}

}
