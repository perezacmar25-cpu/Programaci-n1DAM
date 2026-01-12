package ejercicio05;

public class Gerente extends Empleado {
	
		private double impuestos;

		public Gerente(String nombre, int id, double sueldoBase, double impuestos) {
			super(nombre, id, sueldoBase);
			this.impuestos = impuestos;
		}

		public double getImpuestos() {
			return impuestos;
		}

		public void setImpuestos(double impuestos) {
			this.impuestos = impuestos;
		}

		@Override
		public String toString() {
			return "Gerente [impuestos=" + impuestos + "]";
		}
		
			
		
		public double calcularSueldo() {
			
			return super.calcularSueldo()-impuestos;
			
			
			
		}
		

}
