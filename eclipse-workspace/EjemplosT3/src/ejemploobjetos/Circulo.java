package ejemploobjetos;

public class Circulo {

		private double radio;
	//Constructor con parámetros
	
		public Circulo(double radio) {
			
			this.radio=radio;
			
		}
		
		public void imprimirDatos(){
			
			System.out.println("Radio: "+radio);
			
			
		}
	
		//Método para calcular el área
		
		public double areaCirculo() {
			
			double area=0.0;
			
			area=Math.PI*Math.pow(radio, 2);
			
			return area;
		}
		
		
		
		
		
	
	
	
	
}
