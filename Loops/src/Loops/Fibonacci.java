package Loops;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Enter any integer: ");
			
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		
		int previusOneNumber = 0;
		int previusActualNumber = 1;
		int result;
		do {
			if (i==0) {
				System.out.println(previusOneNumber);
			}else if(i==1) {
				System.out.println(previusActualNumber);
			}else {
				result = previusOneNumber + previusActualNumber;
				System.out.println(result);
				previusOneNumber = previusActualNumber;
				previusActualNumber = result;
			}					
			
			i++;
			}
		
		while (i <= num);
		
		for (int i = 0; i <= num; i++) {
			if (i==0) {
				System.out.println(previusOneNumber);
			}else if(i==1) {
				System.out.println(previusActualNumber);
			}else {
				result = previusOneNumber + previusActualNumber;
				System.out.println(result);
				previusOneNumber = previusActualNumber;
				previusActualNumber = result;
			}	
			
		}
			

		
	}

}
