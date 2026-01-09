package ejercicio04;
import java.util.Random;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros= new int[10];
		int desde=1;
		int hasta=99;
		int suma=0;
		double media;
		int pos;
		int contador=0;
		int num;
	
		Random r= new Random(System.nanoTime());
			
		for(int i=0;i<numeros.length;i++) {
			
		 numeros[i]=r.nextInt(hasta-desde+1)+desde;
			
			
		}
		 
		 for(int i=0;i<numeros.length;i++) {
			 System.out.println((i+1)+" El valor es: " +numeros[i]);
		
	}
		
			
			
		 for(int i=0;i<numeros.length;i++) {
				
				suma=suma+numeros[i];
				
				
		
	}
		 	media=(double)suma/numeros.length;
			System.out.println("\nLa suma es: "+suma);
			System.out.printf("\nLa media es: %.2f ",media);
		
			System.out.println("\n\n¿Qué posición quiere ver?");
			pos=Leer.datoInt();
			System.out.println("El número es: "+numeros[pos-1]);
			
			System.out.println("\n¿Qué número en específico quiere ver?");
			num=Leer.datoInt();
			for(int i=0;i<numeros.length;i++) {
				
				if(numeros[i]==num) {
					contador++;
					
					System.out.println("\nEl número "+num+" está " +contador+" veces");
				}
				}
			
			if(contador==0) {
				System.out.println("\nNo hay ningún "+num);
			}
	
			
			
			
	}
			


}


