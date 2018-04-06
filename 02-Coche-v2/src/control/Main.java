package control;

import habichuelas.Deportivo;
import habichuelas.Utilitario;
import habichuelas.Coche;

public class Main {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		coche1.equals(coche2);
		
		
		coche1.setMarca("S");
        coche1.setModelo("I");
        coche1.setColor("B");
        coche1.setCombustible("D");
        coche1.setNumPuertas(5);
        coche1.setPotencia(80);
        coche1.setConsumoGas(5);
        System.out.println(coche1);

        
        Coche c2 = new Coche("opel","corsa", "plata");
        System.out.println(c2);
        
        Deportivo depor = new Deportivo();
        depor.setMarca("L"); 
        depor.setModelo("P");
        depor.setColor("Az");
        depor.setCombustible("G");
        depor.setNumPuertas(2);
        depor.setPotencia(300);
        depor.setConsumoGas(8);
        depor.setDescapotable(1);
        
        Coche utilitario2 = new Utilitario(1, "Ferrari", "250 gto", "rojo", "diesel", 2, 300, 8);
        System.out.println(utilitario2);
        
        Utilitario utilitario = new Utilitario();
        utilitario.setMarca("BMW");
        utilitario.setModelo("X6");
        utilitario.setColor("Gris");
        utilitario.setCombustible("Diesel");
        utilitario.setNumPuertas(4);
        utilitario.setPotencia(30000);
        utilitario.setConsumoGas(8);
        utilitario.setTransmision(1);

        System.out.println(coche1);
        System.out.println(depor);
        System.out.println(utilitario);
	}

}
