package control;

import model.Mensaje;
import utilidades.Escribano;

public class Saludator {
			public void saludar(){
				Mensaje msg = new Mensaje();
				msg.setTexto("Hola Mundo");
				Escribano.escribirPantalla(msg);
			}

}
