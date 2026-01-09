package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double radio;
		double total2;
		double areaCentimetros;
		Circulo cir;
		
		System.out.println("Di un radio");
		radio=Leer.datoDouble();
		
		cir= new Circulo(radio);
				

		total2=cir.radioCirculo();
		areaCentimetros=cir.pasarCentimetros();
		
		System.out.printf("El área es: %.4f m2 ",total2);
		System.out.printf("\n\nEl área en centímetros es: %.4f cm2 ",areaCentimetros);
		

	}

}
