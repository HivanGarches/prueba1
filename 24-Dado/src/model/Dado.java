package model;

//solo comentario para probar git gui
import java.util.ArrayList;
import java.util.List;

public class Dado {

	
		private List<Integer> tiradas= new ArrayList<>();
		
		public Dado(){
			super();
			
			int a=0;
			while(a<100){
				
				this.tiradas.add(1 + (int)(Math.random() * ((6 - 1) +1)));
				
				a++;
			}
		}

		public List<Integer> getTiradas() {
			return tiradas;
		}

		public void setTiradas(List<Integer> tiradas) {
			this.tiradas = tiradas;
		}

		@Override
		public String toString() {
			return "Dado [tiradas=" + tiradas + "]";
		}
}
