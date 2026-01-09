package ejemploobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaramos círculo
		
		Circulo c1;
		double radio;
		double areaTotal;
		
		//Instanciamos
		System.out.println("¿Qué radio tiene el círculo?");
		radio=Leer.datoDouble();
		
		 c1= new Circulo(radio);
		 
		 c1.imprimirDatos();
		 
		 areaTotal=c1.areaCirculo();
		 
		 
		 System.out.printf("\nEl área es: %.4f m2",areaTotal);
		
		
		
		 
		
		
	}

}
