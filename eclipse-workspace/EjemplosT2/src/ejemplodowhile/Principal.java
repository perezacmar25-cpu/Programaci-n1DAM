package ejemplodowhile;
import java.nio.channels.AsynchronousSocketChannel;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		
		do {
			System.out.println("Pulsa 1 si quiere escuchar un chiste");
			System.out.println("Pulsa 2 si quiere escuchar un refrán");
			System.out.println("Pulsa 0 si quiere acabar el programa");
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
			case 0:
				
				System.out.println("Ha decidido terminar\n");
				System.out.println("Gracias por usar el programa");
				break;
			case 1: 
				
				System.out.println("¿Cómo se llama la hija de Thor? Thorrija");
				break;
				
			case 2: 
				
				System.out.println("El que mucho abarca, poco aprieta");
				break;
					
				default:
					
					System.out.println("Opción inválida");
					
			
			}
			
			}while(opcion!=0);
			
		
		
	}

}
