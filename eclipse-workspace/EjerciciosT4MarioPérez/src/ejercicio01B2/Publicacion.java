package ejercicio01B2;

public class Publicacion {
	
	private int id;
	private String nombre;
	private boolean prestado;
	private int fecha;
	
	
	public Publicacion(int id, String nombre, boolean prestado,int fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.prestado=prestado;
		this.fecha=fecha;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isPrestado() {
		return prestado;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", nombre=" + nombre + ", prestado=" + prestado + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
	
	
	

}
