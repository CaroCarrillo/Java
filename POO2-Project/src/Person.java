
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String email; //propiedad de instacia //existe una por cada objeto que creemos
	private static int total = 0;//propiedad de clase //s?lo existe 1 y es mediante la clase
	
	public Person(String firstName, String lastName, int age, String email) 
		throws EmailFormatException{
		super();
		total ++;
		this.firstName = firstName.toUpperCase();;
		this.lastName = lastName.toUpperCase();
		this.age = (age<18)?18:age;
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$" , Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches() ) {
			this.email = email;
		}else {
			throw new EmailFormatException("El formato dell correo electr?nico es incorrecto");//lanzar una excepci?n EmailFormatException
		}//else
	}//constructor
	
	public Person () {
		
	}//constructor
	
	public static int getTotal() {
		return total;
	}//getTotal

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.toUpperCase();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age<18)?18:age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		this.email = "noemail@nodomain.com";
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$" , Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches() ) {
			this.email = email;
		}else {
			throw new EmailFormatException("El formato del correo electr?nico es incorrecto");//lanzar una excepci?n EmailFormatException
		}//else
	}//setEmail

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + "]";
	}
	

}//class person