package pooTarea;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
public Student(String firstName, String lastName, int registration, int grade, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}

public void printFullName(){
    System.out.println(this.firstName + " " + this.lastName);
 }

 public Boolean isApproved(){
     //TODO implement: should return true if grade >= 60
	 if (this.grade >=60) {
		return true; 
	 }else {
		 return false;
	 }
 }

 public int changeYearIfApproved(){
     //TODO implement: the student should advance to the next year if he/she grade is >= 60
     // Make year = year + 1, and print "Congragulations" if the student has been approved
	 boolean passed = this.isApproved();
	 if (passed) {
		 this.year +=1;
	 System.out.println("Congratulations");
	  }
	 return 0;
 	}
 }