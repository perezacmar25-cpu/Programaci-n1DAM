package ejercicio03;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		double dos=2;
		double resultado;
		
		
		
		System.out.println("Hola. Este programa te dice si el número es par o impar");
		System.out.println("Introduzca un número entero");
		numero=Leer.datoInt();
		
		resultado=numero%dos;
		
		if(resultado==0) {
			System.out.println("Su número es par");
			
		}else {
			System.out.println("Su número es impar");
		}
		
		System.out.println("Gracias por usar el programa");
		
		
		
		
	}

}
