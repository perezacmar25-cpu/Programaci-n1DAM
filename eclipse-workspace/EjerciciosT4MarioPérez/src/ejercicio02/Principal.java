package ejercicio02;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		String fecha, autor, salesianos="Salesianos", colegio="Colegio Salesianos San Pedro";
		Documento d1= new Documento (salesianos,colegio);
		
		System.out.println("\n\nDiga fecha");
		fecha=Leer.dato();
		Carta c1= new Carta (salesianos,colegio,fecha);
		System.out.println("Diga autor");
		autor=Leer.dato();
		TarjetaDeVisita tV= new TarjetaDeVisita(salesianos,colegio,autor);
		do {
		System.out.println("\nPulsa 1 si quiere mostrar un documento normal");
		System.out.println("Pulsa 2 si quiere mostrarlo con el autor");
		System.out.println("Pulsa 3 si quiere mostrarlo con la fecha");
		op=Leer.datoInt();
		
		switch(op) {
		
		case 1:
			
				d1.imprimirDoc();
				break;
			
			
		case 2:
				tV.imprimirDoc();
				break;
			
			
		case 3:
				c1.imprimirDoc();
				break;
				
			
		}
		
		
		
		
		
		}while(op!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
