package control;


import habichuelas.Coche;
import habichuelas.Utilitario;
import habichuelas.Deportivo;
import utilidades.Lector;


public class Main {

	public static void main(String[] args) {
		
		Coche coche1= new Coche();
		
		Lector lector = new Lector();
		String valor = lector.leerString();
		coche1.setMarca(valor);
		
		Lector lector1 = new Lector();
		coche1.setMarca(lector.leerString());
		
		coche1.setMarca(new Lector().leerString());
		
		coche1.setMarca(Lector.leerString1());
		
		 coche1.setModelo("Ibiza");
	        coche1.setColor("Blanco");
	        coche1.setCombustible("Diesel");
	        coche1.setNumPuertas(5);
	        coche1.setPotencia(90);
	        coche1.setConsumoGas(4);

	        //coche deportivo
	        Deportivo depor = new Deportivo();
	        depor.setMarca("Ferrari");
	        depor.setModelo("250 gto");
	        depor.setColor("rojo");
	        depor.setCombustible("Diesel");
	        depor.setNumPuertas(2);
	        depor.setPotencia(300);
	        depor.setConsumoGas(8);
	        depor.setDescapotable(1);

	        Coche depor2 = new Deportivo(1, "Ferrari", "250 gto", "rojo", "diesel", 2, 300, 8);
	        System.out.println(depor2);

	        // COCHE SUV      
	        Utilitario todoterreno = new Utilitario();
	        todoterreno.setMarca("BMW");
	        todoterreno.setModelo("X6");
	        todoterreno.setColor("Gris");
	        todoterreno.setCombustible("Diesel");
	        todoterreno.setNumPuertas(4);
	        todoterreno.setPotencia(30000);
	        todoterreno.setConsumoGas(8);
	        todoterreno.setTransmision(1);

	        System.out.println(coche1);
	        System.out.println(depor);
	        System.out.println(todoterreno);

	}

}
