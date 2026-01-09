package ejercicio05;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int exponente;
		double resultado;
		int cero=0;
		int uno=1;
		
		System.out.println("Hola, este programa calcula potencias de todo tipo");
		System.out.println("Introduzca un número");
		numero=Leer.datoInt();
		System.out.println("Introduzca un exponente");
		exponente=Leer.datoInt();
		
		if(exponente>cero) {
			resultado=Math.pow(numero,exponente);
			System.out.printf("El resultado es: %.2f",resultado);
			
		}
		
		if(exponente==cero) {
			resultado=uno;
			System.out.println("El resultado es 1");
			
		}
		
		if(exponente<cero) {
			resultado=uno/Math.pow(numero,exponente);
			System.out.printf("El resultado es: %.2f ",resultado);
		}
		
		System.out.println("\n\nGracias por usar el programa");
	}

}
