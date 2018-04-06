package habichuelas;

public class Utilitario extends Coche {
	
	private int transmision;
	
		public Utilitario(){
			
		}
		
		public Utilitario(int transmision) {
			this.transmision = transmision;
		}
		
		public Utilitario(int transmision, String marca, String modelo, String color, String combustible, int numPuertas, int potencia, int consumoGas) {
	        super(marca, modelo, color, combustible, numPuertas, potencia, consumoGas);
	        this.transmision = transmision;
	    }
	    
	    

	    public int getTransmision() {
	        return transmision;
	    }

	    public void setTransmision(int transmision) {
	        this.transmision = transmision;
	    }

	    @Override
	    public String toString() {
	        return super.toString()+", Suv{" + "transmision=" + transmision + '}';
	    }

}
