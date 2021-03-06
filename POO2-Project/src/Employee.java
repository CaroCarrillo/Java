
public class Employee extends Person implements Pagable {//implements tiene que cumplir con las reglas de la interface pagable
	private String department;
	private double salary;
	
	public Employee(String firstName, String lastName, int age, String email, String department, double salary)
			throws EmailFormatException {
		super(firstName, lastName, age, email);
		this.department = department;
		this.salary = salary;
	}//constructor
	
	//m?todo propio
	public double calculateSalary() {
		return (this.salary * 21) * 1.16;
	}
	
	public String getDepartment() {
		return department;
	}//getDepartment
	public void setDepartment(String department) {
		this.department = department;
	}//setDepartment
	public double getSalary() {
		return salary;
	}//getSalary
	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary
	
	@Override
	public String toString() {
		return super.toString() + "Employee [department=" + department + ", salary=" + salary + "]";
	}//toString
	
	
}
