package utilidades;

import java.util.Scanner;


public class Recolector {
	public static int leerInt(){
		return new Scanner (System.in).nextInt();
	}
	public static String leerString(){
		return new Scanner(System.in).nextLine();
	}
	
}
