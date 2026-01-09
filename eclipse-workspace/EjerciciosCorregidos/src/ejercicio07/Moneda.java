package ejercicio07;

import java.util.Random;

public class Moneda {
	
	private boolean cara;
	
		public int lanzarMoneda() {
		int desde=1;
		int hasta=2;
		int num;
		Random r=new Random(System.nanoTime());
		num=r.nextInt(hasta-desde+1)+desde;
		return num;
		
		//1=CARA
		//2=CRUZ
	}

}
