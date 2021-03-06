
public class Manager extends Employee implements Pagable { //implements tiene que cumplir con las reglas de la interface pagable
	private int numberOfEmployees;
	private float percentage;
	
	public Manager(String firstName, String lastName, int age, String email, String department, double salary,
			int numberOfEmployees, float percentage) throws EmailFormatException {
		super(firstName, lastName, age, email, department, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.percentage = percentage;
	}//constructor
	
	@Override
	public double calculateSalary() {
		return ((this.getSalary() * 21) * (percentage + 1)) * 1.16;
	}//calculatedSalary

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}//getNumberOfEmployees

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}//setNumberOfEmployees

	public float getPercentage() {
		return percentage;
	}//getPercentage

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}//setPercentage

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", percentage=" + percentage + ", getDepartment()="
				+ getDepartment() + ", getSalary()=" + getSalary() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + "]";
	}//toString
	

}//class Manager