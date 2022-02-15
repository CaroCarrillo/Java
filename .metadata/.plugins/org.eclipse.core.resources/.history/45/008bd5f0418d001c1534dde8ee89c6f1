package flujoDeControl;
import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int age = scan.nextInt();
			
		double price = 7;
		if (age < 5) {
			price = price * 0.4;
		}
		else if (age > 60) {
			price = price * 0.45;
		}
		else {
			System.out.println("Ingresa la cantidad de boletos");
			int quantity = scan.nextInt();
			
			if (quantity >= 2) {
				price = price * quantity * 0.7;
			}
		}
		
		System.out.println("El total a pagar es: " + price + " Euros.");
		}
	}