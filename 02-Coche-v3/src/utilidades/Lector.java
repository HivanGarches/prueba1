package utilidades;

import java.util.Scanner;

public class Lector {
	
	public String leerString(){
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public int leerInt(){
		Scanner input = new Scanner(System.in);
		return input.nextInt();
		
	}
	
	public static String leerString1(){
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

}
