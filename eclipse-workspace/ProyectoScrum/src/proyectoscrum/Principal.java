package proyectoscrum;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		String[] registro;
		int tam=7;
		int edad;
		int catorce=14;
		int dieciocho=18;
		double notamedia;
		int ocho=8;
		double saldo;
		double recarga;
		double descuento1=60;
		double cien=100;
		double saldofinal;
		double total;
		double descuento2=50;
		int treinta=30;
		double descuento3=35;
		double descuento4=25;
		


		
		do {
			System.out.println("\nBienvenido a ViajeJoven. Este programa se encarga de hacer descuentos en tu tarjeta de transporte según tu nota media y la edad que tengas");
			System.out.println("\nPulsa 1 si eres estudiante");
			System.out.println("\nPulsa 2 si no eres estudiante");
			opcion=Leer.datoInt();
			switch(opcion) {
		
				case 1:
						registro= new String[7];
						System.out.println("Regístrate");
						System.out.println("\nNombre");
						registro[0]=Leer.dato();
						System.out.println("Apellidos");
						registro[1]=Leer.dato();
						System.out.println("DNI");
						registro[2]=Leer.dato();
						System.out.println("Código Postal");
						registro[3]=Leer.dato();
						System.out.println("Localidad");
						registro[4]=Leer.dato();
						System.out.println("Dirección");
						registro[5]=Leer.dato();
						System.out.println("Edad");
						edad=Leer.datoInt();
						if(edad>30 ||edad<15) {
							System.out.println("Este programa no es para ti. Lo sentimos mucho");
						}else {
							
						
						
						System.out.println("Otro servicio que se le ofrece en esta empresa es el de que según su nota media obtiene un descuento u otro");
						System.out.println("\n¿Cuál es su nota media?");
						notamedia=Leer.datoDouble();
						
						
						if(catorce<edad && edad<=dieciocho && notamedia>ocho) {
							
							System.out.println("Con esa edad y esa nota media, se le va a aplicar un 60% de descuento en su recarga");
							System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");
							saldo=Leer.datoDouble();
							System.out.println("¿Cuánto dinero desea recargar?");
							recarga=Leer.datoDouble();
							saldofinal=saldo+(recarga*descuento1/cien)+recarga;
							System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f ",saldofinal);
							
							
							
							
						}
						if(catorce<edad && edad<=dieciocho && notamedia<ocho) {
							
							System.out.println("Con esa edad y esa nota media, se le va a aplicar un 50% de descuento en su recarga");
							System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");
							saldo=Leer.datoDouble();
							System.out.println("¿Cuánto dinero desea recargar?");
							recarga=Leer.datoDouble();
							saldofinal=saldo+(recarga*descuento2/cien)+recarga;
							System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f ",saldofinal);
							
							
						}
						
						if(dieciocho<edad && edad<=treinta && notamedia>ocho) {
							
							System.out.println("Con esa edad y esa nota media, se le va a aplicar un 35% de descuento en su recarga");
							System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");
							saldo=Leer.datoDouble();
							System.out.println("¿Cuánto dinero desea recargar?");
							recarga=Leer.datoDouble();
							saldofinal=saldo+(recarga*descuento3/cien)+recarga;
							System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f ",saldofinal);
						
						
						
						
				}
						if(dieciocho<edad && edad<=treinta && notamedia<ocho) {
							
							System.out.println("Con esa edad y esa nota media, se le va a aplicar un 25% de descuento en su recarga");
							System.out.println("\n¿Cuánto dinero tienes en la tarjeta?");
							saldo=Leer.datoDouble();
							System.out.println("¿Cuánto dinero desea recargar?");
							recarga=Leer.datoDouble();
							saldofinal=saldo+(recarga*descuento4/cien)+recarga;
							System.out.printf("Entonces, cumpliendo esos requisitos, su saldo se quedaría en: %.2f ",saldofinal);
						
				
							break;
							
				}
						}
				  case 2:
						System.out.println("\nEste programa solo sirve para estudiantes, lo sentimos mucho.");
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
