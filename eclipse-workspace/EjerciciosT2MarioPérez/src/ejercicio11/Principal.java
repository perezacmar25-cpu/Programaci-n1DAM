package ejercicio11;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int opcion;
		int entradas1;
		double precioTS=7;
		double precio1;
		int entradas2;
		double precioT=6;
		double precio2;
		int entradas3;
		double preciorl=8;
		double precio3;
		int entradas4;
		double precioecdl=5;
		double precio4;
		
		
		System.out.println("Hola buenas, este programa te da todo tipo de información sobre ciertas salas de cine");
		System.out.println("Pulsa 1 si quieres ir a la sala uno.(Toy Story)");
		System.out.println("Pulsa 2 si quieres ir a la sala dos.(Torrente)");
		System.out.println("Pulsa 3 si quieres ir a la sala tres.(El rey león)");
		System.out.println("Pulsa 4 si quieres ir a la sala cuatro.(El corredor del laberinto)");
		opcion=Leer.datoInt();
		
		
		switch(opcion) {
		
				case 1:
					
					System.out.println("El precio de Toy Story sería de 7 euros la entrada");
					System.out.println("¿Cuántas entradas quiere?");
					entradas1=Leer.datoInt();
					precio1=precioTS*entradas1;
					System.out.printf("El precio total sería: %.2f" ,precio1);
					break;
				case 2:
					System.out.println("El precio de Torrente sería de 6 euros la entrada");
					System.out.println("¿Cuántas entradas quiere?");
					entradas2=Leer.datoInt();
					precio2=precioT*entradas2;
					System.out.printf("El precio total sería: %.2f ",precio2);
					break;
				case 3:
					System.out.println("El precio de El rey león sería de 8 euros la entrada");
					System.out.println("¿Cuántas entradas quiere?");
					entradas3=Leer.datoInt();
					precio3=entradas3*preciorl;
					System.out.printf("El precio total sería: %.2f" ,precio3);
					break;
				case 4:
					System.out.println("El precio de El corredor del laberinto sería de 5 euros la entrada");
					System.out.println("¿Cuántas entradas quiere?");
					entradas4=Leer.datoInt();
					precio4=entradas4*precioecdl;
					System.out.printf("El precio total sería: %.2f",precio4);
					break;
					
					default:
						System.out.println("Opción inválida");
		
		}
		
				System.out.println("\n\nGracias por usar el programa");
					
		
	}

}
