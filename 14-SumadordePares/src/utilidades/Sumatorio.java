package utilidades;

public class Sumatorio {
	
	public static int sumadorTope(int num){
		int result=0;
		for (int a=1;a<num;a++){
			if(a%2==0){
				result+=a;
			}
		}
		return result;
	}
	
	public static int sumarX(int num){
		int result=0, cont=0, a=0;
		
		do {
			if(a%2==0){
				cont++;
				result+=a;
			}
			a++;
			
		}while(cont<=num);
		return result;
	}

}
