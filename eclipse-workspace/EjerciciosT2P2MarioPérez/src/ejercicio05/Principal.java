package ejercicio05;
import java.util.Random;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int []notas;
		int hasta;
		int desde;
		int[] lista;
		int suma=0;
		double media;
		
		Random r= new Random (System.nanoTime());
		System.out.println("Cuántas notas quiere introducir");
		tam=Leer.datoInt();
		notas=new int[tam];
		System.out.println("¿Desde qué número quieres?");
		desde=Leer.datoInt();
		System.out.println("¿Hasta qué número quieres?");
		hasta=Leer.datoInt();
		lista= new int[tam];
		
		for(int i=0;i<lista.length;i++) {
			
			lista[i]=r.nextInt(hasta-desde+1)+desde;
			
		}
		
		for(int i=0;i<lista.length;i++) {
			
			System.out.println((i+1)+ "El valor es: "+lista[i]);
		}
		
		for(int i=0;i<lista.length;i++) {
			suma=suma+lista[i];
			
		}
		
		for(int i=0;i<lista.length;i++) {
			
			media=(double)suma/lista.length;
			
		}
		
		for(int i=0;i<lista.length;i++) {
			
		
		
		
		
	}

}
}
