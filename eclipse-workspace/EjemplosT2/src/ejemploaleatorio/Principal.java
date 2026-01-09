package ejemploaleatorio;
import java.util.Random;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int hasta;
		int desde;
		int numero;
		int cantidad;
		int[] lista;
		
		Random r= new Random (System.nanoTime());
		System.out.println("Hasta qué número quieres");
		hasta=Leer.datoInt();
		System.out.println("Desde dónde");
		desde=Leer.datoInt();
		System.out.println("Cuántos numeros quiere generar");
		cantidad=Leer.datoInt();
		lista= new int[cantidad];
		
		for(int i= 0;i<cantidad;i++) {
			
			lista[i]=r.nextInt(hasta-desde+1)+desde;
			
		}
		
		for(int i= 0;i<cantidad;i++) {
			System.out.println("Ha salido el: "+lista[i]);
			
		}
		
		numero=r.nextInt(hasta-desde+1)+desde;
		
		System.out.println("Hola: "+numero);
		
		
		
		
		
	}

}
