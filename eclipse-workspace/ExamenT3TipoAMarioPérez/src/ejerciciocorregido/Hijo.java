package ejerciciocorregido;

public class Hijo {

	private String nombre;
	private int id;
	private int horasSemana;
	private int edad;
	public Hijo(String nombre, int id, int horasSemana, int edad) {

		this.nombre = nombre;
		this.id = id;
		this.horasSemana = horasSemana;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHorasSemana() {
		return horasSemana;
	}
	public void setHorasSemana(int horasSemana) {
		this.horasSemana = horasSemana;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", id=" + id + ", horasSemana=" + horasSemana + ", edad=" + edad + "]";
	}
	
	
	
	public double calcularPaga(double por, double cantidad) {
		double resultado;
		double aportacion;
		double cien=100;
		resultado=horasSemana*cantidad;
		aportacion=resultado*(por/cien);
		return resultado-aportacion;
		//se pueden ahorrar variables
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
