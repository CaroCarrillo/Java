	//Crear clase
	//Crear propiedades de instacia (razonSocial, cantidad, precioUnitario)
	//1. Constructor todas las propiedades
	//2. Crear Getters y Setters
	//3. Crear el toString() con todas las propiedades	

public class Proveedor implements Pagable{
	private String razonSocial;
	private int cantidad;
	private double precioUnitario;
	
	//1. Constructor todas las propiedades
	public Proveedor(String razonSocial, int cantidad, double precioUnitario) {
		super();
		this.razonSocial = razonSocial;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	
	//2. Crear Getters y Setters
	public String getRazonSocial() {
		return razonSocial;
	}//getRazonSocial

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}//setRazonSocial

	public int getCantidad() {
		return cantidad;
	}//getCantidad

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}//setCantidad

	public double getPrecioUnitario() {
		return precioUnitario;
	}//setCantidad

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}//setPrecioUnitario

	@Override
	public String toString() {
		return "Proveedor [razonSocial=" + razonSocial + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ "]";
	}//toString

	@Override
	public double calculateSalary() {
		return (getCantidad() * getPrecioUnitario()) * 1.16;
 	}//calculateSalary
	
}// class proveedor 
