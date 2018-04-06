package control;

import model.Mensaje;
import utilidades.Escribano;

public class Saludador {
	
		public void saludar(){
			Mensaje msg= new Mensaje();
			msg.setTexto("Hola Mundo");
			new Escribano().escribirPantalla(msg);
		}

}
