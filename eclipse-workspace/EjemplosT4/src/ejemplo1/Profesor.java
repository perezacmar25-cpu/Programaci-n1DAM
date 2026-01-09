package ejemplo1;

public class Profesor extends Persona{
	
	
	private String asignatura;
	private double sueldo;
	public Profesor(String nombre, String apellidos, String dni, int id, int edad, String asignatura, double sueldo) {
		super(nombre, apellidos, dni, id, edad);
		this.asignatura = asignatura;
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return super.toString()+"Profesor [asignatura=" + asignatura + ", sueldo=" + sueldo + "]";
	}
	
	
	
	
	
	
	
	

}
