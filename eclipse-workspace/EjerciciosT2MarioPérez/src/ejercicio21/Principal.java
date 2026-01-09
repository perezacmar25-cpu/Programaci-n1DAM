package ejercicio21;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double suma;
		double resta;
		double multiplicacion;
		double division;
		double numero;
		double numero2;
		int opcion;
		//se hace con el do while
		
		System.out.println("Este programa hace todo tipo de cuentas");
		
		System.out.println("Ingresa un número");
		numero=Leer.datoDouble();
		
		System.out.println("Ingresa otro número");
		numero2=Leer.datoDouble();
		
		System.out.println("¿Qué operación desea realizar?");
		System.out.println("Pulsa 1 si quiere sumar");
		System.out.println("Pulsa 2 si quiere restar");
		System.out.println("Pulsa 3 si quiere multiplicar");
		System.out.println("Pulsa 4 si quiere dividir");
		
		opcion=Leer.datoInt();
		

		
		
		switch(opcion) {
		
		case 1:
				suma=numero+numero2;
				
				System.out.printf("El resultado es: %.2f ",suma);
				
				if(suma%2==0) {
					System.out.println("El resultado es par");
					
					
				}else { 
					System.out.println("\n\nEl resultado es impar");
				}
				
				
				break;
		case 2:
				resta=numero-numero2;
				
				System.out.printf("El resultado es: %.2f ",resta);
				
				if(resta%2==0) {
					System.out.println("\n\nEl resultado es par");
					
					
				}else { 
					System.out.println("\n\nEl resultado es impar");
				}
				
				break;
		case 3:
				multiplicacion=numero*numero2;
				
				System.out.printf("El resultado es: %.2f ",multiplicacion);
				
				if(multiplicacion%2==0) {
					
					System.out.println("\n\nEl resultado es par");
					
					
				}else { 
					System.out.println("\n\nEl resultado es impar");
				}
				
				break;
				
		case 4:
			
				if(numero2==0) {
					System.out.println("\n\nNo se puede dividir por 0");
					
					break;
					//no se puede usar break en medio de un case
				}else {
				
				
				division=numero/numero2;
				
				
				System.out.printf("El resultado es: %.2f ",division);
				
				if(division%2==0) {
					System.out.println("\n\nEl resultado es par");
					
					
				}else { 
					System.out.println("\n\nEl resultado es impar");
				}
				
				break;
				}
				
		default:
			
				System.out.println("\nError");
				
				break;
		}
		
		
		
		
		
		
	}

}
