import org.generation.nomina.Employee;

public class testEmployee {
	public static void main(String[] args) {
		
		Employee Carolina = new Employee("Carolina", "Carrillo", 26, "CAQC960120XXX", 500.50);
		
		//Leonora.firstName = "Carolina";
		//Leonora.lastName = "Carrillo";

		System.out.println(Carolina.firstName + " "+ Carolina.lastName);
		Carolina.calculateSalary();
		Carolina.calculateSalary(10);
		Carolina.calculateSalary(10,2);
		
		Employee Claudia = new Employee ("Claudia", "Carrillo");
		Claudia.calculateSalary(10,2);
		System.out.println(Claudia);


		
	}//main
	
}//class testEmployee
