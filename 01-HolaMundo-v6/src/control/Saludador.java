package control;

import model.Mensaje;
import utilidades.Escribano;
import utilidades.LectorDatos;

public class Saludador {
	
		public void saludar(){
			Mensaje msg = new Mensaje();
			msg.setTexto(LectorDatos.LeerTexto("Saluda: "));
			Escribano.escribirPantalla(msg);
		}

}
