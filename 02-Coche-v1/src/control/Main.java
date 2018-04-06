package control;

import habichuelas.Coche;
import habichuelas.Suv;
import habichuelas.Deportivo;

public class Main {

	public static void Main(String[] args) {
		//Instanciando primer objeto para empezar a trabajar con el
		
		Coche coche1 = new Coche();
        coche1.setMarca("C");
        coche1.setModelo("S");
        coche1.setColor("N");
        coche1.setCombustible("D");
        coche1.setNumPuertas(5);
        coche1.setPotencia(70);
        coche1.setConsumoGas(3);
        
        //Imprimimos datos
        
        System.out.println("La marca del coche es " + coche1.getMarca());
        System.out.println("El modelo es " + coche1.getModelo());
        System.out.println("El color es " + coche1.getColor());
        System.out.println("El tipo de combustible es " + coche1.getCombustible());
        System.out.println("Numero de puertas es " + coche1.getNumPuertas());
        System.out.println("Su potencia es  " + coche1.getPotencia() + " CV");
        System.out.println("Su consumo de 1 a 10 es " + coche1.getConsumoGas());
        System.out.println("");
        
		//Instanciamos coche deportivo
        
        Deportivo depor= new Deportivo();
        depor.setMarca("F");
        depor.setModelo("T");
        depor.setColor("R");
        depor.setCombustible("G");
        depor.setNumPuertas(3);
        depor.setPotencia(330);
        depor.setConsumoGas(4);
        
        
        //Imprimimos datos deportivo
        
        System.out.println("La marca del coche es " + depor.getMarca());
        System.out.println("El modelo es " +depor.getModelo());
        System.out.println("El color es " + depor.getColor());
        System.out.println("Es descapotable 1: - Si y  2: -No " + depor.getDescapotable());
        System.out.println("El tipo de combustible es " + depor.getCombustible());
        System.out.println("Numero de puertas es " + depor.getNumPuertas());
        System.out.println("Su potencia es  " + depor.getPotencia() + " CV");
        System.out.println("Su consumo de 1 a 10 es " + depor.getConsumoGas());
        System.out.println("");
        
        //Instanciamos coche suv
        
        Suv todoterreno = new Suv();
        todoterreno.setMarca("H");
        todoterreno.setModelo("2");
        todoterreno.setColor("R");
        todoterreno.setCombustible("Dl");
        todoterreno.setNumPuertas(5);
        todoterreno.setPotencia(300);
        todoterreno.setConsumoGas(8);
        todoterreno.setTransmision(1);
        
        //Imprimiendo datos suv
        
        System.out.println("La marca del coche es " + todoterreno.getMarca());
        System.out.println("El modelo es " + todoterreno.getModelo());
        System.out.println("El color es " + todoterreno.getColor());
        System.out.println("1- 4 x 4 y 2- 4 x 2 " + todoterreno.getTransmision());
        System.out.println("El tipo de combustible es " + todoterreno.getCombustible());
        System.out.println("Numero de puertas es " + todoterreno.getNumPuertas());
        System.out.println("Su potencia es  " + todoterreno.getPotencia() + " CV");
        System.out.println("Su consumo de 1 a 10 es " + todoterreno.getConsumoGas());
	}

}
