package habichuelas;

public class Coche {
	
	private String marca,modelo,color,combustible;
	int numPuertas,potencia,consumoGas;
	
	public Coche() {
	}
	
	public void setMarca(String marca){
		this.marca=marca;
		
	}
	public String getMarca() {
			return marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo= modelo;
		
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
		this.numPuertas=numPuertas;
	}
	
	public int getPotencia(){
		return potencia;
	}
	
	public void setPotencia(int potencia) {
		this.potencia=potencia;
	}
		
	public int getConsumoGas(){	
		return consumoGas;
		
	}
	
	public void setConsumoGas(int consumoGas){
		this.consumoGas=consumoGas;
	}
		
}
