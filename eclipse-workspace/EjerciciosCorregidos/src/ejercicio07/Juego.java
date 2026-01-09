package ejercicio07;

import java.util.Random;

public class Juego {

	private boolean resultado;
	
	
	public boolean resultado(int opcion) {
		int desde=1;
		int hasta=2;
		int num;
		
		Random r=new Random(System.nanoTime());
		num=r.nextInt(hasta-desde+1)+desde;
		if(num==opcion) {
			resultado=true;
			
			
		}else {
			resultado=false;
			
		}
		return resultado;
		
	}
	
	public void imprimirResultado(int opcion) {
		if(resultado) {
			System.out.println("Ganador");
		}else {
			System.out.println("Ha perdido");
		}
		
	}
	
	
	
	
	
}
