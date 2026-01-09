package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preciolitro=1.3;
		double consumokilómetro;
		double recorrido;
		
		
		System.out.println("Introduzca el recorrido realizado");
		recorrido=Leer.datoDouble();
		
		System.out.println("¿Cuando consume su coche por kilómetro?");
		consumokilómetro=Leer.datoDouble();
		
		double resultado=recorrido*consumokilómetro*preciolitro;
		System.out.printf("El gasto total es: %.2f",resultado);
		
		
		
		
		
		
		
	}

}
