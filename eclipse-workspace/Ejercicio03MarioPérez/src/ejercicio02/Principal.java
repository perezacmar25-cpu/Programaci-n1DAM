package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double espaciorecorrido;
		double velocidad=3.2;
		int tiempo=3;
		double espacioinicial;
		
		
		
		System.out.println("¿Cuánto ha recorrido ya el objeto?");
		espacioinicial=Leer.datoDouble();
		
		espaciorecorrido=espacioinicial+velocidad*tiempo;
		
		System.out.printf("Por lo tanto, el objeto ha recorrido un total de: %.2f ",espaciorecorrido);
		
		
		
		
		
		
	}

}
