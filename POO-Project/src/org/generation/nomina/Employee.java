package org.generation.nomina;

public class Employee {
	//Propiedades
	public String firstName;
	public String lastName;
	int age;
	String RFC;
	double salary;
	//ArrayList<String> lista;
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 18;
		this.RFC = "xxsascc";
		this.salary = 172.87;
	}//constructor
	
	public Employee(String firstName, String lastName, int age, String rFC, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.RFC = RFC;
		this.salary = salary;
	}//constructor
	public void calculateSalary() {
		System.out.println(this.salary*21);
	}//calculateSalary
	
	public void calculateSalary(int days) {
		System.out.println(this.salary * days);
	}//calculateSalary
	
	public void calculateSalary(int days, int holidays) {
		holidays *= 2;
		System.out.println((this.salary * holidays) + (this.salary * days));
	}//calculateSalary

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", RFC=" + RFC
				+ ", salary=" + salary + "]";
	}//toString
	
	
	
}//class Employee
