package ejercicio20;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldo=1000;
		int op;
		double retirar;
		double precioEntrada=6;
		int numEntradas;
		double precioTotalEntradas;
		double ingresar;
		
		
		do {
		System.out.println("\n\nHola. Bienvenido al cajero automático");
		System.out.println("Pulsa 1 si quiere ver su saldo");
		System.out.println("Pulsa 2 si quiere retirar dinero");
		System.out.println("Pulsa 3 si quiere comprar entradas");
		System.out.println("Pulsa 4 si quiere ingresar dinero");
		System.out.println("Pulsa 0 si quiere acabar");
		
		op=Leer.datoInt();
		
		
		
		
		switch(op) {
		
		case 1:
			System.out.printf("Su saldo restante es: %.2f € ",saldo);
			break;
			
		case 2:
			
			System.out.println("¿Cuánto dinero quiere retirar?");
			retirar=Leer.datoDouble();
			saldo=saldo-retirar;
			System.out.printf("Operación retirada con éxito");
			break;
			
		case 3:
			
				System.out.println("¿Cuántas entradas quiere comprar");
				numEntradas=Leer.datoInt();
				precioTotalEntradas=numEntradas*precioEntrada;
				System.out.printf("El precio sería de: %.2f ",precioTotalEntradas);
				break;
				
		case 4:
			
				System.out.println("¿Cuáno dinero quiere ingresar");
				ingresar=Leer.datoDouble();
				saldo=saldo+ingresar;
				
		case 0:
			
				System.out.println("Gracias. Vuelva pronto");
				break;
				
		default:
			
			System.out.println("Error");
			break;
		}
		
				}while(op!=0);

}
}
