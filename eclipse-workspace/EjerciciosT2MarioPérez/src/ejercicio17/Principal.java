package ejercicio17;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota5;
		double nota6;
		double notamedia;
		double suma;
		double seis=6;
		int opcion;
		int suspenso=0;
		do {
		System.out.println("Pulsa 1 si quiere ver su media y sus suspensos");
		System.out.println("Pulsa 0 si quiere salir");
		opcion=Leer.datoInt();
		switch(opcion) {
		case 1:
			System.out.println("Di la nota del primero");
			nota1=Leer.datoDouble();
			System.out.println("¿Di la nota del segundo");
			nota2=Leer.datoDouble();
			System.out.println("¿Di la nota del tercero");
			nota3=Leer.datoDouble();
			System.out.println("¿Di la nota del cuarto");
			nota4=Leer.datoDouble();
			System.out.println("¿Di la nota del quinto");
			nota5=Leer.datoDouble();
			System.out.println("¿Di la nota del sexto");
			nota6=Leer.datoDouble();
			
			suma=nota1+nota2+nota3+nota4+nota5+nota6;
			notamedia=suma/seis;
			
			System.out.println("Tu nota media sería de: "+notamedia);
			
			if(nota1<5) {
				suspenso=suspenso+1;

				
			}
			if(nota2<5) {
				suspenso=suspenso+1;
			
			}
			if(nota3<5) {
				suspenso=suspenso+1;
			
		}
			if(nota4<5) {
				suspenso=suspenso+1;
				

		}
			if(nota5<5) {
				suspenso=suspenso+1;
			}
				
			
		
			if(nota6<5) {
				suspenso=suspenso+1;
		
	}

			System.out.println("\nTiene "+suspenso+" suspensos\n");
			break;
			
		case 0:
			System.out.println("Gracias por usar el programa, vuelva pronto");
			break;
			
		default:
			System.out.println("Error");
			break;
			
			
}
		}while(opcion!=0);
		
	}
}
