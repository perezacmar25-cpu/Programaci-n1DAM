package ejercicio1;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cabecera c1, c4;

		String asignatura, aula, fecha;

		//CREAMOS LOS OBJETOS USANDO LOS DISTINTOS CONSTRUCTORES.

		

		//1. A CASCAPORRA

		//CON TODOS LOS PARÁMETROS

		 c1=new Cabecera ("Programación", "1DAM", "6/11/2025");


		//OJOOOOOOO SE DECLARAN ARRIBA Y SE INSTANCIAN ABAJO


		System.out.println("Introduce la fecha del examen.");

		fecha=Leer.dato();

		System.out.println("Introduce la asignatura");

		asignatura=Leer.dato();

		System.out.println("Introduce el aula");

		aula=Leer.dato();

		c4=new Cabecera (asignatura, aula, fecha);

		c4.ImprimirCabecera();

		
		System.out.println(c4);
		

		

		

		



	}



}