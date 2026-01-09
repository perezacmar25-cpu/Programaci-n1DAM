package ejemplopoliforfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuadrado c1 = new Cuadrado("Primer cuadrado","Rojo",1.0);
		
		
		Circulo ci1 = new Circulo("Primer círculo","Azul",1.0);
		
		
		Figura f1 = new Cuadrado ("Segundo cuadrado", "verde",2.0);
		
		
		Figura f2 = new Circulo ("Segundo círculo", "Amarillo",2.0);
		
		
		Figura lista [] = new Figura [4];
		
		
		System.out.println(f1.calcularArea());
		
		
		lista[0] = f1;
		
		OperacionesFiguras of = new OperacionesFiguras();
		
		for(int i=0; i<lista.length;i++) {
			
			System.out.println(of.calcularElAreaDeUnaFigura(lista[i]));
		}
		
		System.out.printf("La suma de todas es: %.2f",of.sumarAreas(lista));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
