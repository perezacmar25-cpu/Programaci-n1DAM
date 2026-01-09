package ejercicio02;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1;
		double num2;
		double resultado;
		
		System.out.println("Hola, bienvenido al programa. En este se dividirán dos números");
		System.out.println("Inserte un número");
		num1=Leer.datoDouble();
		
		System.out.println("Inserte el segundo número");
		num2=Leer.datoInt();
		
		
		
		
		if (num2==0) {
			System.out.println("Error");
		}else {
			
			resultado=num1/num2;
			System.out.printf("El resultado es:%.2f ",resultado);
		}
		
	}
}