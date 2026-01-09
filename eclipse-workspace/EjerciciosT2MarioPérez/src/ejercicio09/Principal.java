package ejercicio09;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entradas;
		double precio;
		String dia;
		String mier="miercoles";
		double descuento;
		double preciototal;
		double preciodescontado;
		double cien=100;
		
		System.out.println("Este programa te calcula el precio de las entradas de cine cualquier día");
		System.out.println("¿Cuántas entradas va a comprar?");
		entradas=Leer.datoInt();
		System.out.println("¿Cuánto vale cada una?");
		precio=Leer.datoDouble();
		System.out.println("¿Para qué día la quiere?");
		dia=Leer.dato();
	
	
		if (dia.equals(mier)) {
			System.out.println("¿Qué porcentaje te descuentan?");
			descuento=Leer.datoInt();
			preciototal=entradas*precio;
			descuento=preciototal*(descuento/cien);
			preciodescontado=preciototal-descuento;
			System.out.printf("El precio total es: %.2f ",preciodescontado);
		
		}else {
			preciototal=entradas*precio;
			System.out.printf("El precio total es: %.2f ",preciototal);
		}
		
		
	}

}
