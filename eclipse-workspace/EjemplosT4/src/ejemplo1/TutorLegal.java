package ejemplo1;

public class TutorLegal extends Persona{
	
	
	private String tipoTutor;
	private String trabajo;
	private Alumno alumnoAsignado;
	public TutorLegal(String nombre, String apellidos, String dni, int id, int edad, String tipoTutor, String trabajo,
			Alumno alumnoAsignado) {
		super(nombre, apellidos, dni, id, edad);
		this.tipoTutor = tipoTutor;
		this.trabajo = trabajo;
		this.alumnoAsignado = alumnoAsignado;
	} 	
	
	
	
	
	

}
