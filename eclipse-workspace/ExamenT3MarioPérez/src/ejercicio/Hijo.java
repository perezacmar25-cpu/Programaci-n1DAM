package ejercicio;

public class Hijo {

	private String nombre;
	private int id;
	private int edad;
	private int horasSemana;
	public Hijo(String nombre, int id, int edad, int horasSemana) {
	
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.horasSemana = horasSemana;
		
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getHorasSemana() {
		return horasSemana;
	}
	public void setHorasSemana(int horasSemana) {
		this.horasSemana = horasSemana;
	}
	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", horasSemana=" + horasSemana + "]";
	}
	
	public double calcularPaga(double paga, double por) {
		
		double pagaTotal;
		double porcentajeTotal=por/100;
		
		pagaTotal=(horasSemana*paga)-porcentajeTotal;
		return pagaTotal;
		
		
		
	}
	
	
	
	
	
}
