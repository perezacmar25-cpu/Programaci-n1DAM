package ejemploestatico;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		double por;
		
		Producto p1= new Producto ("Fanta",1.50);
		Producto p2= new Producto ("CocaCola",1.60);
		Gestion g1= new Gestion ();
		Gestion g2= new Gestion();
		
		System.out.println("¿Cuánto le quiere ganar?");
		por=Leer.datoDouble();
		System.out.println(p1);
		System.out.println(g1.calcularLineaVenta(por, 1, p1));
		System.out.println(g1.calcularLineaVenta(por, 1, p2));
		
		
		 System.out.printf( "%.2f",g2.sumarCaja(por, 1, p2));    
		
		
		
		
		 
		 
		 
		 
	}

}
