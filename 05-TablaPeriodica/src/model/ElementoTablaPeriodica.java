package model;

public class ElementoTablaPeriodica {

			
			
			private String nombre,simbolo;
			private int numero;
			private static int contador=0;
			
			public ElementoTablaPeriodica(String nombre, String simbolo, int numero){
				
				this.nombre=nombre;
				this.simbolo=simbolo;
				this.numero=numero;
				contador++;
				
			}
			
			
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getSimbolo() {
				return simbolo;
			}
			public void setSimbolo(String simbolo) {
				this.simbolo = simbolo;
			}
			public int getNumero() {
				return numero;
			}
			public void setNumero(int numero) {
				this.numero = numero;
			}
			
			public int numeroDeElementos(){
				return contador;
			}
			
			
}
