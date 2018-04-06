package control;

import model.Dado;
import utiles.Lector;

public class Test {
	
	public static void prueba(){
		Dado dado = new Dado();
		
		Lector.leerInt(dado.toString());
	}

}
