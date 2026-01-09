package ejercicio12;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		double masa;
		double mercurio=0.38, jupiter=2.53, peso, venus=0.91, tierra=1, marte=0.38, saturno=1.06, urano=0.92, neptuno=1.2;
		int opcion2;
		
		
		
		
		
		System.out.println("Bienvenido al programa. Este programa calcula la equivalencia de tu peso en cada planeta del Sistema Solar");
		System.out.println("Diga su masa en kg");
		
		masa=Leer.datoDouble();
		
		System.out.println("Ahora diga en planeta en el que quiere conocer su peso\n");
		System.out.println("Pulsa 1 si quieres elegir Mercurio");
		System.out.println("Pulsa 2 si quieres elegir Venus");
		System.out.println("Pulsa 3 si quieres elegir la Tierra");
		System.out.println("Pulsa 4 si quieres elegir Marte");
		System.out.println("Pulsa 5 si quieres elegir Júpiter");
		System.out.println("Pulsa 6 si quieres elegir Saturno");
		System.out.println("Pulsa 7 si quieres elegir Urano");
		System.out.println("Pulsa 8 si quieres elegir Neptuno");
		
		
		opcion=Leer.datoInt();
		
		
		switch (opcion) {
		
		
			case 1: 
				peso=masa*mercurio;
			
				System.out.println("¿En qué idioma quiere el resultado?");
				System.out.println("Pulsa 1 si quiere inglés");
				System.out.println("Pulsa 2 si quiere español");
				opcion2=Leer.datoInt();
				
				switch(opcion2) {
					case 1:
						System.out.printf("Your weight at Mercurio: %.2f ",peso);
						break;
					case 2:
						System.out.printf("Tu peso en Mercurio es: %.2f",peso);
						break;
				}
				
				break;
			case 2: 
				peso=masa*venus;
				System.out.printf("Su peso en Venus es %.2f ",peso);
				break;
				
			case 3: peso=masa*tierra;
				System.out.printf("Su peso en la Tierra es %.2f ",peso);
				break;
				
			case 4: peso=masa*marte;
				System.out.printf("Su peso en Marte es %.2f ",peso);
				break;
				
			case 5:peso=masa*jupiter;
				System.out.printf("Su peso en Júpiter es %.2f ",peso);
				break;
				
			case 6:peso=masa*saturno;
				System.out.printf("Su peso en Saturno es %.2f ",peso);
				break;
				
			case 7:peso=masa*urano;
				System.out.printf("Su peso en Urano es %.2f ",peso);
				break;
				
			case 8:peso=masa*neptuno;
				System.out.printf("Su peso en Neptuno es %.2f",peso);
				break;
				
			default:
				System.out.println("Opción inválida");
				
			
			
		}
		
		System.out.println("\n\nGracias por usar el programa, vuelva pronto");
	}

}
