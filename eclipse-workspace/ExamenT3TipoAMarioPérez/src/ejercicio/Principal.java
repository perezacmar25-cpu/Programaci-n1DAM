package ejercicio;


import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horasMes=0, op, id, antiguedad=0,cont=0, id2, horas2, id3, num, id4;
		double pagaHora=0, presupuesto,porcentaje=0;
		
		String nombre;
		Profesor [] lista;
		int tam=100;
		lista=new Profesor[tam];
		Profesor p2;
		Administracion a;
		a=new Administracion(lista);
		p2=new Profesor();
		cont++;
		
		
		
		
		
		do {
		System.out.println("Pulsa 1 si quiere agregar un profesor a la lista");
		System.out.println("Pulsa 2 si quiere buscar a un profesor");
		System.out.println("Pulsa 3 si quiere ver los profesores que llevan trabajando la cantidad de tiempo que quiera");
		System.out.println("Pulsa 4 si quiere calcular cuando se gastará en nóminas de profesores que llevan más de 20 años trabajando");
		System.out.println("Pulsa 5 si quiere mostrar un mensaje según su sueldo");
		System.out.println("Pulsa 6 si quiere modificar alguna hora");
		System.out.println("Pulsa 7 si quiere ver su presupuesto restante");
		System.out.println("Pulsa 8 si quiere ver los datos de todos los profesores");
		System.out.println("Pulsa 9 si quiere calcular un porcentaje del sueldo");
		System.out.println("Pulsa 0 si quiere acabar");
		
		
		op=Leer.datoInt();
		
			switch(op) {
		
						case 1:
								System.out.println("Diga nombre y apellidos");
								nombre=Leer.dato();
								System.out.println("Diga id");
								id=Leer.datoInt();
								System.out.println("Diga cuánto tiempo lleva trabajando");
								antiguedad=Leer.datoInt(); 
								System.out.println("¿Cuántas horas trabajas al mes?");
								horasMes=Leer.datoInt();
								System.out.println("¿Cuánto cobras la hora?");
								pagaHora=Leer.datoDouble();
								System.out.println("¿Qué porcentajes pagas de impuestos?");
								porcentaje=Leer.datoDouble();
								p2=new Profesor(nombre,id,antiguedad,horasMes);
								p2.calcularSueldo(pagaHora, porcentaje);
								a.agregar(cont, p2);
								cont++;
								break;
								
								
						case 2:
								System.out.println("Dime el id que quieras buscar");
								id4=Leer.datoInt();
								System.out.println(a.findById(id4));
								break;
								
								
								
						case 3:
								
								a.buscarByAntiguedad();
								break;
			
			
			
						case 4:
								a.calcularDineroVeinte(pagaHora, porcentaje);
								break;
								
								
						case 5:
								System.out.println("¿De qué profesor quiere calcular el sueldo? Di número");
								num=Leer.datoInt();
								a.comprobarSueldo(pagaHora,porcentaje,num);
								break;
			
						case 6:
								System.out.println("Diga el id del profesor al que le quieres modificar la hora");
								id2=Leer.datoInt();
								System.out.println("¿Cuántas horas quiere poner?");
								horas2=Leer.datoInt();
								a.modificarHorasTrabajadas(id2, horas2);
								break;
								
						case 7:
								System.out.println("¿Cuál era su presupuesto inicial?");
								presupuesto=Leer.datoDouble();
								a=new Administracion(presupuesto);
								a.calcularPresupuestoRestante(presupuesto,pagaHora, porcentaje);
								break;
								
								
						case 8:
								System.out.println(a.toString());
								break;
								
								
						case 9:
								System.out.println("¿De qué profesor quiere saberlo?");
								id3=Leer.datoInt();
								a.calcularPorcentajePresupuesto(id3, pagaHora, porcentaje);
								break;
								
								
						case 0:
								System.out.println("Gracias por usar el programa");
								break;
								
								
						default:
							System.out.println("Error");
							break;
								
								
								
	}
		}while(op!=0);

}
}
