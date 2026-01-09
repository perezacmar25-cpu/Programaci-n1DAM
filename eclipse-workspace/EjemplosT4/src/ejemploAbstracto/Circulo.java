package ejemploAbstracto;

public class Circulo extends Figura {
	
	
	private double radio;

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		double dos=2;
		return Math.PI*Math.pow(radio, dos);
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [radio=" + radio + "]";
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	
	



}

