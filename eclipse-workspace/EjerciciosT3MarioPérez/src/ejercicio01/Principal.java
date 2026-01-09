package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cabecera cab;
		String asignatura="Asignatura" , aula="Aula" , fecha="Fecha";
		
		System.out.println("Este programa hace la cabecera de un examen\n");
		
		cab= new Cabecera();
		
		cab.nombreAsignatura(asignatura, aula, fecha);
		
		System.out.println("\n\nGracias por usar el programa");
		
		
	}

}
