package ejercicio;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hijo h;
		Hijo [] lista;
		int op, id,edad,horasEstudiadas, cont=0,tam=100, idBuscada, horasEstudiadas2,num,num2;
		double por, paga, presupuesto;
		lista= new Hijo[tam];
		GestionFamiliar gf;
		gf=new GestionFamiliar(lista);
		String nombre;
		lista[0]=h=new Hijo("Mario",1,17,10);
		cont++;
		
		System.out.println("Bienvenido al programa de Gestión Familiar");
		System.out.println("Si quiere calcular la paga di la paga dada");
		paga=Leer.datoInt();
		System.out.println("Diga el porcentaje de descuento");
		por=Leer.datoDouble();
		h.calcularPaga(paga, por);
		
		
		do {
		System.out.println("\nPulsa 1 si quiere agregar un hijo a la lista");
		System.out.println("Pulsa 2 si quieres buscar al hijo que quieras");
		System.out.println("Pulsa 3 si quieres buscar los hijos menores de 14 años");
		System.out.println("Pulsa 4 si quiere calcular cuánto gastarás solo con los menores de 14");
		System.out.println("Pulsa 5 si quiere modificar las horas estudiadas de un hijo");
		System.out.println("Pulsa 6 si quiere saber cuánto presupuesto le queda después de pagarle a los hijos");
		System.out.println("Pulsa 7 si quiere mostrar todos los datos de los hijos");
		System.out.println("Pulsa 8 si quiere calcular el porcentaje gastado en el hijo que quiera");
		System.out.println("Pulsa 9 si quiere comprobar la paga con dos mensajes");
		System.out.println("Pulsa 0 si quiere acabar");
		op=Leer.datoInt();
		
		switch(op) {
		
					case 1:
							System.out.println("Diga el nombre del hijo");
							nombre=Leer.dato();
							System.out.println("Diga el id");
							id=Leer.datoInt();
							System.out.println("Diga la edad");
							edad=Leer.datoInt();
							System.out.println("Diga las horas trabajadas");
							horasEstudiadas=Leer.datoInt();
							h=new Hijo(nombre,id,edad,horasEstudiadas);
							lista[cont]=h;
							cont++;
							break;
							
					case 2:
							System.out.println("Di el id del hijo al que quieres buscar");
							idBuscada=Leer.datoInt();
							gf.findById(idBuscada);
							break;
							
							
							
					case 3:
							System.out.println(gf.buscarMenorCatorce()); 
							break;
							
							
							
					case 4:
							System.out.printf("Se gastará: %.2f€",gf.calcularPagaCatorce(paga));
							break;
							
							
							
					case 5:
						
							System.out.println("De qué hijo quiere cambiar las horas?");
							num=Leer.datoInt();
							System.out.println("¿Cuál sería el nuevo número de horas?");
							horasEstudiadas2=Leer.datoInt();
							lista[num-1].setHorasSemana(horasEstudiadas2);
							System.out.println("Horas cambiadas con éxito");
							break;
							
					case 6:
						System.out.println("¿Cuál era su presupuesto inicial?");
						presupuesto=Leer.datoDouble();
						gf=new GestionFamiliar(lista,presupuesto);
						System.out.printf("Su presupuesto restante sería de: %.2f€",gf.calcularPresupuesto(presupuesto, paga, por,cont));
						break;
							
							
							
							
					case 7:
							System.out.println(gf.toString()); 
							break;
							
							
					
							
							
					case 8:
							System.out.println("¿De qué hijo quieres calcular el porcentaje?");
							num2=Leer.datoInt();
							gf.calcularPorcentaje(num2,paga,por);
							break;
							
							
							
					case 9:
							gf.imprimirMensaje(paga);
							break;
						
						
					case 0:
							System.out.println("\nMuchas gracias por usar el programa. Vuelva pronto.");
							
							
							
							
							
		}
		
		
		
		
		
		
		
		
	}while(op!=0);

}
}
