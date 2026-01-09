package ejercicio;
import java.util.Random;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]calorias;
		int tam;
		int max;
		int min;
		int dia;
		int opcion;
		int cantidad1;
		double mediadiaria;
		int suma = 0;
		int cont=0;
		int dia2;
		int mediarecomendada=2200;
		int porcentajeIngerido;
		int cien=100;
		int opc2=1;
		int menor=5000;
		int op;
		
		System.out.println("Bienvenido al programa. Este te permite hacer algunas operaciones sobre las calorías que ingieres según el periodo de tiempo que desee");
		Random r= new Random(System.nanoTime());
		do {
			System.out.println("elijsa un opcion:");
			
			op=Leer.datoInt();
			switch(op) {
			
			case 1:
				System.out.println("¿Cuántos días quieres guardar la cantidad de calorías?");
				tam=Leer.datoInt();
				calorias=new int[tam];
				System.out.println("¿Cuál es el mínimo de calorías?");
				min=Leer.datoInt();
				System.out.println("¿Y el máximo?");
				max=Leer.datoInt();
				for(int i=0; i<calorias.length;i++) {
					calorias[i]=r.nextInt(max-min+1)+min;
			
		}
		for(int i=0; i<calorias.length;i++) {
			
			System.out.println("El valor es: "+calorias[i]+" calorías");
		}
		break;
			case 0:
					System.out.println("Adios");
					break;
		do {
		
		
		
		
		
		
			System.out.println("\nPulse 1 si quiere modificar las calorias tomadas en el día que quiera y la cantidad");
			System.out.println("Pulse 2 si quiere mostrar el menor número de calorías y cuántas veces se ha ingerido esa cantidad");
			System.out.println("Pulse 3 si quiere mostrar las calorías de cada día");
			System.out.println("Pulse 4 si quiere mostrar la media de calorías tomadas al día");
			System.out.println("Pulsa 5 si quiere mostrar cuántos días ha ingerido menos de la media recomendada");
			System.out.println("Pulsa 6 si quiere calcular el % de calorías en el día que quiera");
			System.out.println("Pulsa 0 si quiere acabar");
			opcion=Leer.datoInt();
			switch(opcion) {
			
				case 1:
						System.out.println("Qué día quiere modificar las calorías?");
						dia=Leer.datoInt();
						
						while(calorias.length>=dia && opc2!=0 ) {
						System.out.println("¿Por qué cantidad desea cambiar la cantidad dada?");
						cantidad1=Leer.datoInt();
						calorias[dia-1]=cantidad1;
						System.out.println("Si no quiere seguir editando pulse 0");
						opc2=Leer.datoInt();
						System.out.println("Se ha cambiado correctamente. Ahora, el día "+dia+" tiene guardadas "+cantidad1+" calorías");
						for(int i=0; i<calorias.length;i++)
						System.out.println("El valor es: "+calorias[i]);
						
		}
						break;
						
				case 2:
						for(int i=0; i<calorias.length;i++) {
							if (calorias[i]<menor) {
								menor=calorias[i];
							}
						}
						System.out.println(menor);
						
						break;
						
						
				case 3: 
						System.out.println("\tDía\t\t\t\tCalorías");
						for(int i=0; i<calorias.length;i++) {
						System.out.println("\t"+(i+1)+"\t\t\t\t"+calorias[i]);
		}
						break;
						
				case 4:
						for(int i=0; i<calorias.length;i++) {
						suma+=calorias[i];
						
						}
						
						mediadiaria=suma/calorias.length;
						System.out.printf("La media diaria es: %.2f\n",mediadiaria);
						
						break;
						
				case 5:
						for(int i=0; i<calorias.length;i++) {
						if(calorias[i]<2200) {
							cont++;
						
					
						}
						
		

		}
						System.out.println("\n"+cont+" días ha ingerido usted menos calorías de la recomendada");
						break;
				case 6:
						System.out.println("¿Qué día quiere saber el porcentaje de calorías consumido en un día respecto a la media recomendada?");
						dia2=Leer.datoInt();
						porcentajeIngerido=((calorias[dia2-1]*cien)/mediarecomendada);
						System.out.println("El % es: "+porcentajeIngerido);
						
						break;
						
				case 0:
						System.out.println("Gracias por usar el programa, vuelva pronto");
						break;
						
				default:
						System.out.println("Error");
			}

				
					
					
					
	}while(op!=0);
	}
		
}while(op!=0);
}
}
