package ejercicio16;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tope=10;
		int suma=0;
		int num;
		int mult=1;
		
		System.out.println("Di un número");
		num=Leer.datoInt();
		
		for(int i=0;i<tope;i++) {
			suma=suma+num;
			mult=mult*num;
			
			System.out.println("La suma es: "+suma);
			System.out.println("La multiplicación es: "+mult);
			
		}
		
		
		
	}

}
