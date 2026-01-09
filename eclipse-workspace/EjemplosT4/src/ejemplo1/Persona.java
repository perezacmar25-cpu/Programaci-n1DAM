package ejemplo1;

public class Persona {
	//estos atributos se supone que son los que se repiten en las demás clases. 
	//Una vez que se pongan aquí, se eliminan de las otras
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int id;
	private int edad;
	
	public Persona(String nombre, String apellidos, String dni, int id, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.id = id;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", id=" + id + ", edad="
				+ edad + "]";
	}
	
	public int sumarEdad(int cant) {
		
		return edad+cant;
		
		
		
	}
	
	
	

}
