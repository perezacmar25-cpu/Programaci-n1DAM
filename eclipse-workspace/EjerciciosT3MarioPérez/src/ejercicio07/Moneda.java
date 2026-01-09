package ejercicio07;

import java.util.Random;

public class Moneda {

	
	public int tirarMoneda() {
		int desde=1;
		int hasta=2;
		int num;
		Random r= new Random(System.nanoTime());
		num=r.nextInt(hasta-desde+1)+desde;
		return num;
		
	}
	
	public int ganador(int opcion) {
		int desde=1;
		int hasta=2;
		int num;
		Random r= new Random(System.nanoTime());
		num=r.nextInt(hasta-desde+1)+desde;
		
		if(opcion==num) {
			
			
		}else {
			
		}
		return num;
		
	}
	
	
	
}
