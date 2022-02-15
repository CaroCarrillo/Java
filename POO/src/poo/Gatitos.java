package poo;

//Esta clase será nuestra plantilla. Nos ayudará a crear un montón de gatitos.


	public class Gatitos { //Definimos nuestra clase "Gatito". Esta clase nos ayudará a darle características generales a nuestros gatitos.

		//Le vamos a dar atributos a nuestra clase
		private String nombre; //Variable de tipo cadena
		private String color; //Variable de tipo cadena
		private String raza; //Variable de tipo cadena
		private int edad; //Variable de tipo int
		
		// Cómo podemos ver, para agregar atributos, primero escribimos el tipo y el nombre del atributo.
		
		// Ahora creamos nuestros métodos (serán las acciones que hará nuestro gatito)
		
		
		// Primer método: Constructor. Nos permitirá instanciar un objeto de la clase a la que pertenece. En pocas palabras, crearemos un gatito.
		
		
		// Utilizamos this en los constructores y en los métodos set para referirnos a los atributos del objeto creado.
		
		public Gatitos (String nom, String col, String raz, int ed) {
			this.nombre = nom;
			this.color = col;
			this.raza = raz;
			this.edad = ed;
		}

		/* Un constructor simplemente es un metodo que nos devuelve un objeto, y puede llamarse igual que la clase.
		 * Podemos crear constructores sin parametros si no los queremos establecer de antemano.
		 */
		
		// También podemos crear constructores sin parámetros
		
		public Gatitos() {
			this.nombre= ""; //nombre vacío
			this.color= ""; // color vacío
			this.raza= ""; // raza vacía
			this.edad= 0 ; // edad cero
		}
		
		//Ahora crearemos métodos para consultar los datos de nuestro gatito.(Getters)

	    public String consultarNombre (){ //Consultamos el nombre
	        return nombre;
	    }
	    
	   	public String consultarColor() { //Consultamos el color
			return color;
		}
		
	    public String consultarRaza (){ //Consultamos la raza
	        return raza;
	    }

	    public int consultarEdad (){ //Consultamos la edad
	        return edad;
	    }
	    
	    
	    // Ahora crearemos los métodos para consultar los datos del gatito.(Setters)
	    
	    public void establecerNombre(String nom) {
	    	this.nombre=nom;
	    }
	    
	    public void establecerColor(String col) {
	    	this.color=col;
	    }
	    public void establecerRaza(String raz) {
	    	this.raza=raz;
	    }
	    public void establecerEdad(int ed) {
	    	this.edad=ed;
	    }
	    
	    //Método void main para ejecutar la aplicación Java
	    public static void main(String[] args) {
			
	    	Gatitos gatito1 = new Gatitos();//Creación del objeto dentro de la clase Gatito
	    	
	    	//Asiganción de valores mediante los métodos Setters
	    	gatito1.establecerNombre("Cilantro");
	    	gatito1.establecerColor("Blanco");
	    	gatito1.establecerRaza("Main");
	    	gatito1.establecerEdad(3);
	    	
	    	
	    	//Visualización dentro de consola del objeto
	    	System.out.println("El nombre del gatito es: "+gatito1.consultarNombre());
	    	System.out.println("El color del gatito es: "+gatito1.consultarColor());
	    	System.out.println("La raza del gatito es: "+gatito1.consultarRaza());
	    	System.out.println("La edad del gatito es: "+gatito1.consultarEdad());
		}
	    
	}


