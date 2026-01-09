package ejercicio012;

import utilidades.Leer;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numlatas;
		double preciolatas;
		int numpipas;
		double preciopipas;
		double precioespada;
		String nombre;
		double preciototalcocacola;
		double preciototalpipas;
		double total;
		
		System.out.println("Hola, este programa genera un ticket de su compra");
		System.out.println("¿Cuántas CocaCola ha comprado?");
		numlatas=Leer.datoInt();
		System.out.println("¿Cuánto vale cada una?");
		preciolatas=Leer.datoDouble();
		preciototalcocacola=preciolatas*numlatas;
		System.out.println("Total cocacola: "+preciototalcocacola);
		
		
		System.out.println("Bien, ahora dime, ¿cuántos paquetes de pipas ha comprado?");
		numpipas=Leer.datoInt();
		System.out.println("¿Cuánto vale cada uno?");
		preciopipas=Leer.datoDouble();
		preciototalpipas=numpipas*preciopipas;
		System.out.println("Total pipas:"+preciototalpipas);
		
		
		System.out.println("Por último, ¿Qué espada has comprado?");
		nombre=Leer.dato();
		System.out.println("¿Cuánto cuesta?");
		precioespada=Leer.datoDouble();
		
		
		
		total=preciototalcocacola+preciototalpipas+precioespada;
		System.out.println("El precio total es "+total +"€");	
		System.out.println("\n\n");
		
				System.out.println("							TICKET DE LA COMPRA							\n"
									+"**************************************************************************** \n"
									+ "Le atendió: Jonh Snow														\n"
									+ "Fecha:29/09/25																\n"
									+ "Nombre\t\tUnidades\tP/u\tDescuento\tSubtotal			\n"
									+ "Cocacola\t\t4\t1.20\t0\t\t4.80				\n"
									+ "Pipas		2				0.40		0				0.80				\n"
									+ "Garra		1				150			0				150					\n");		
									
	  
		
		//CORRECCIÓN
				//
		
		
		
		
	}	
	
	
	

}
