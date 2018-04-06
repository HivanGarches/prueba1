package utilidades;

import model.Mensaje;

public class Escribano {
		public static void escribirPantalla(Mensaje msg){
			System.out.print("[Pantalla] "+msg);
		}
		
		public static void escribirFichero(Mensaje msg){
			System.out.print("[Fichero] "+msg);;
		}

}
