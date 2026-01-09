package ejemploAbstracto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Circulo c1 = new Circulo (2.5,3.4,5);
		Cuadrado cu1= new Cuadrado(2.3,3,7);
		
		
		System.out.println("C1: "+c1);
		System.out.println("Cu1: "+cu1);
		System.out.printf("%.2f",c1.calcularArea());
		System.out.printf("\n\n%.2f",cu1.calcularArea());
	}

}

