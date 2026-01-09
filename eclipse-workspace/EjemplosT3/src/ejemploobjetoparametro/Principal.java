package ejemploobjetoparametro;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p;
		String nombre;
		int ref;
		double precioBase;
		boolean refrigerado=false;
		double porcentaje=0;
		LineaVenta lv;
		int cantidad;
		Venta v;
		double totalVenta=0.0;
		String nombreVendedor="Mario";
		double [] listaImpuestos= {30.0,42.0,10.0};
		Venta2 v2;
		
		
		
		
		System.out.println("Dime nombre");
		nombre=Leer.dato();
		System.out.println("Pulsa 1 si es refrigerado");
		System.out.println("Pulsa 2 si no lo es");
		ref=Leer.datoInt();
		if(ref==1) {
			refrigerado=true;
			System.out.println("Diga el porcentaje");
			porcentaje=Leer.datoDouble();
			
			
		}
		System.out.println("Diga el precio base");
		precioBase=Leer.datoDouble();
		
		p=new Producto(nombre, refrigerado, precioBase);
		
		System.out.printf("Precio final: %.2f€ ",p.calcularPVP(porcentaje));
		System.out.println(p.toString());
		
		System.out.println("¿Cuántos productos llevas?");
		cantidad=Leer.datoInt();
		
		v=new Venta(totalVenta,nombreVendedor,listaImpuestos);
		System.out.printf("Media de impuestos: %.2f€ ",v.calcularMediaImpuestos());
		
		v2= new Venta2(nombreVendedor,totalVenta);
		
		System.out.printf("\nLa media es: %.2f€",v2.calcularVenta2(listaImpuestos));
		
	}

}
