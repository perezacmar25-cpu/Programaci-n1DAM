package ejercicio10;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		double precio;
		int unidades=4;
		double precioporunidad=12.99;
		double descuento;
		double total;
		int cuatro=4;
		double preciodescontado;
		System.out.println("Bienvenido");
		System.out.println("¿Qué producto ha comprado?");
		nombre=Leer.dato();
		
		total=precioporunidad*cuatro;
		System.out.println("Por lo tanto, si ha comprado 4, sería un total de: "+total);
		preciodescontado=total-(total*3/100);
		System.out.println("Si le aplicamos un 3% de descuento, se le quedaría en: "+preciodescontado);
		
	}

}
