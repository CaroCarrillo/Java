
public class testPerson {

	public static void main(String[] args) {
		Person alonso = null;
	try {
		Employee briana = new Employee("Briana", "Valencia", 20, "briana.valencia@generation.org", "Mentor�a",120);
		System.out.println(briana.calculateSalary());
		System.out.println(briana);
		
		Employee jess = new Employee("Jess", "Hern�ndez", 20, "jess.hernandez@generation.org", "Mentor�a",120);
		System.out.println(jess.calculateSalary());
		System.out.println(jess);
		
		
		Manager rufs = new Manager ("Rufino", "Tamayo", 50, "elrufs@gmail.com", "Log�stica", 1500.0, 20, 0.25f);
		System.out.println(rufs.calculateSalary());
		System.out.println(rufs);
		
		alonso = new Employee ("Alonso", "Grajeda", 15, "alonso.grajeda@generation.org","Mentor�a", 150.00);
		System.out.println(((Employee) alonso).calculateSalary());
		//alonso = new Person ("Alonso", "Grajeda", 15, "alonso.grajeda@generation.org");
		//alonso.setFirstName("Alonso Ignacio");
		//alonso.setAge(16);
		//alonso.setFirstName("alonsoenyahooocommx");
		
		Proveedor pepito = new Proveedor("pepito el hamster", 40, 150);
		System.out.println(pepito);
		
		Nomina.calculaPagos(jess);
		Nomina.calculaPagos(briana);
		Nomina.calculaPagos(rufs);
		
		Nomina.calculaPagos(pepito);
		
	}catch (EmailFormatException e) {
		System.out.println(e.getMessage());
	}finally {
			System.out.println(alonso);
			System.out.println("Total de Personas: " + Person.getTotal());
			//System.out.println(alonso.getFirstName());
			//System.out.println(alonso.getAge());
			//System.out.println(alonso.getEmail());
		}//finally
	}//main
}//class testPerson
