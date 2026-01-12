package ejercicio05;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Empleado [] lista;
			
			int tam=5;
			
			int op;
			
			int ventas;
		
		
		Empleado e1= new Vendedor ("Mario",1,2000.0,20,10);
		
		Empleado e2 = new Gerente ("Er cali",2,2500.0,15);
		
		
		
		
		lista = new Empleado[tam];
		
		lista[0]=e1;
		
		lista[1]=e2;
		
		Oficina o1= new Oficina (lista);
		
		System.out.println("Pulsa 1 si eres vendedor");
		System.out.println("Pulsa 0 si no lo eres");
		op=Leer.datoInt();
		
		switch(op) {
		
					case 1:
							System.out.println("¿Cuál es el tope de ventas?");
							ventas=Leer.datoInt();
							if()
							
							
				
				
					case 0:
							System.out.println("Vale");
							break;
							
					default:
							System.out.println("Opción no válida");
							break;
			
		
		
		}
		
		
		
		
	}

}
