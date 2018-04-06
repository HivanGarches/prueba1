package habichuelas;

import java.util.Objects;

public class Coche {
	
	private String marca, modelo, color, combustible;
	private int numPuertas, potencia, consumoGas;
	
	public Coche() {
		
	}

	public Coche(String marca, String modelo, String color, String combustible, int numPuertas, int potencia, int consumoGas) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.combustible = combustible;
		this.numPuertas = numPuertas;
		this.consumoGas = consumoGas;
		this.potencia = potencia;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca){
		this.marca=marca;
		
	}
	
	public String getModelo() {
		return modelo;
		
	}
	
	public void setModelo(String modelo){
		this.modelo=modelo;
	}
	
	public String getColor(){
		return color;
		}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public String getCombustible(){
		return combustible;
	}
	
	public void setCombustible(String combustible){
		this.combustible=combustible;
	}
	
	public int getNumPuertas(){
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas){
		this.numPuertas = numPuertas;
	}
	
	public int getPotencia(){
		return potencia;
	}
	public void setPotencia(int potencia){
		this.potencia = potencia;
	}
	public int getConsumoGas(){
		return consumoGas;
	}
	public void setConsumoGas(int consumoGas){
		this.consumoGas = consumoGas;
	}
	@Override
	public String toString(){
		return "Coche{" +"marca=" + marca + ",modelo=" + modelo + ",color=" + color + ",combustible=" + combustible + ", numPuertas=" + numPuertas + ", potencia=" + potencia + ",consumoGas (1-10)=" + consumoGas + "}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
			
		}
		final Coche other = (Coche) obj;
		if(!Objects.equals(this.modelo,other.marca)){
			return false;
		}
		return true;
	}
 }
