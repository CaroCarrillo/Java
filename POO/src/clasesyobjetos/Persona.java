package clasesyobjetos;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private int edad;

	public static void main(String[] args) {
		
		
		Persona persona1 = new Persona("Guillermo", "Chang", 34);
		System.out.println("El nombre de la persona es: "+persona1.getNombre());
		System.out.println("El apellido de la persona es: "+persona1.getApellido());
		System.out.println("El nombre de la persona es: "+persona1.getEdad());
		
		Persona persona2 = new Persona("","",0);
		persona2.setNombre("Felipe");
		persona2.setApellido("Maqueda");
		persona2.setEdad(29);
		System.out.println("\nEl nombre de la persona es: "+persona2.getNombre());
		System.out.println("El apellido de la persona es: "+persona2.getApellido());
		System.out.println("El nombre de la persona es: "+persona2.getEdad());


	}
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
		
}
