package ejercicio02;

public class Circulo {
	
	
		private double radio;

		public Circulo(double radio) {
			this.radio=radio;
		}
		
		public double radioCirculo() {
		
			double resultado;
			double dos=2;
			resultado=Math.PI*Math.pow(radio, dos);
			return resultado;
			
			
			
		}
		
		public double pasarCentimetros() {
			
			
			double den=10000;
			double areaCentimetros;
			areaCentimetros=radioCirculo()*den;
			return areaCentimetros;
			
			
			
		
		}
		
	
	
}
