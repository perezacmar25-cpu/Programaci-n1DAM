package ejercicio03;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numeros;
		int tam=8;
		int cont=0;
		
		numeros=new int[tam];
		System.out.println("Hola. Bienvenido.");
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.println("Introduzca un número");
			numeros[i]=Leer.datoInt();
		}
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println((i+1)+" El número es: "+numeros[i]);
			if(numeros[i]==0) {
				cont++;
	}
			
			}
			
			System.out.println("Hay "+cont+" ceros");
		
		
		
		
			}
			
		
		

		
		
		
		
	}


