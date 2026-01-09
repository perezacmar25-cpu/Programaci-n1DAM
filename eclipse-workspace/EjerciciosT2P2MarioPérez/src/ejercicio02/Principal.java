package ejercicio02;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros;
		int num;
		int tam=10;
		
		numeros=new int[tam];
		System.out.println("Introduce un número");
		num=Leer.datoInt();
		
		for(int i=0;i<numeros.length;i++) {
			
			numeros[i]=2*num+i;
			
			
		}
		for(int i=0;i<numeros.length;i++) {
			
			System.out.println((i+1)+" El valor es: "+numeros[i]);
		}
		
		
	}

}
