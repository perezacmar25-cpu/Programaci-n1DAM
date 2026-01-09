package ejemplopoliforfismo;

public class OperacionesFiguras {

	public double calcularElAreaDeUnaFigura(Figura f) {
		
		return f.calcularArea();
		
	}
	
	public double calcularElPerimetroDeUnaFigura(Figura f) {
		return f.calcularPerimetro();
	}
	
	
	
	public double sumarAreas(Figura[]listado) {
		
		
		double resultado=0;
		
		for(int i=0;i<listado.length;i++) {
			resultado=resultado+calcularElAreaDeUnaFigura(listado[i]);
		}
		
		return resultado;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
