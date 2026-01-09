package ejemploarray;

public class Producto {

	private String nombre;
	private double precio;
	private int id;
	private boolean activo;
	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	
	public Producto(int id) {
		
		this.id = id;
	}


	public String getNombre() {
		
		return nombre;
		
	}
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	public double getPrecio() {
		
		return precio;
		
	}
	public void setPrecio(double precio) {
		
		this.precio = precio;
		
	}
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	//Si quiero borrar un producto de la lista, tengo que setear el atrubuto boleano "activo" a falso. Se busca dicho producto y seteo su atributo activo a falso
	
	
	//public void delete(int id) {
		//int index=findById(id);
		//if (index>=0) {
			//listaProductos[index].setActivo(false);
		//      
	
	
	
	
	
	
	
	
	
	
}
