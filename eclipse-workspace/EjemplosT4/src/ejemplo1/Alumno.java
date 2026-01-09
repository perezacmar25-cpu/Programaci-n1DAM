package ejemplo1;

public class Alumno extends Persona {
	
	
	
	private double notaMedia;

	public Alumno(String nombre, String apellidos, String dni, int id, int edad, double notaMedia) {
		super(nombre, apellidos, dni, id, edad);
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return super.toString()+"Alumno [notaMedia=" + notaMedia + "]";
	}
	
	public int sumarEdad(int cant) {
		
		return super.sumarEdad(cant)-2;
		
	
		
	}
	
	
	
	
	

}
