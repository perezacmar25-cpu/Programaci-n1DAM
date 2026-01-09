package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fahrenheit;
		double celsius;
		int cte1=32;
		double cinco=5;
		double nueve=9;
		
		
		
		
		System.out.println("Hola, bienvenido a este programa. En este, le ayudamos a convertir los grados Fahrenheit a grados Celsius");
		System.out.println("\n\nMuestre una cantidad de grados Fahrenheit");
		
		fahrenheit=Leer.datoDouble();
		
		celsius=(fahrenheit-cte1)*(cinco/nueve);
		
		System.out.printf("\n\nPor lo tanto, %.2f grados fahrenheit, son %.2f grados celsius",fahrenheit,celsius);
		
		System.out.println("\n\n\nGracias por usar este programa, que tenga un buen día");
		
	}

}
