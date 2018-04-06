package control;

import model.ElementoTablaPeriodica;

public class Test {
	
	public static void Prueba(){
		
		
		ElementoTablaPeriodica hidrogeno = new ElementoTablaPeriodica("hidrogeno","H", 1 );
		ElementoTablaPeriodica helio = new ElementoTablaPeriodica("helio","He", 2 );
		ElementoTablaPeriodica litio = new ElementoTablaPeriodica("litio","Li", 3 );
		ElementoTablaPeriodica Berilio = new ElementoTablaPeriodica("Berilio","Be", 4 );
		ElementoTablaPeriodica Boro = new ElementoTablaPeriodica("Boro","B", 5 );
		
		System.out.println(Boro.numeroDeElementos());
		
	}

}
