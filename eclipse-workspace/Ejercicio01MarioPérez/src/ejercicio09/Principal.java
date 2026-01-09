package ejercicio09;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombre;
		int hab;
		String lugar;
		double resultado;
		int capacidad;
		
		
		System.out.println("Introduce el nombre de tu pueblo");
		nombre=Leer.dato();
		System.out.println("¿Cuántos habitantes tiene?");
		hab=Leer.datoInt();
		System.out.println("Introduce el lugar");
		lugar=Leer.dato();
		System.out.println("¿Qué capacidad tiene el lugar?");
		capacidad=Leer.datoInt();
		resultado=capacidad/hab;
		
		
		
		System.out.printf("En %s pueden entrar %.2f %s",lugar,resultado,nombre);
		
		
		//NO SE PONEN OPERACIONES AL DECLARAR VARIABLES
		
		
		
		
		
	}
	
	
	
	

}
