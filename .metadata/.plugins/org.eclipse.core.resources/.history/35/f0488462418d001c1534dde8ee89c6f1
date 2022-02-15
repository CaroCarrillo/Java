package flujoDeControl;
import java.util.Scanner;

public class Part1 {
	
		public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu número de ventas");
		double sales = scan.nextDouble();
			
		double comission = 0;
		if (sales > 10000) {
				comission = sales * 0.3;
		}
		else if (sales > 5000 && sales < 10000) {
			comission = sales * 0.2;
		}
		else if (sales > 1000 && sales < 5000) {
			comission = sales * 0.1;
		}
		else
			System.out.println("No hay comisión igual o debajo de $1000");
			System.out.println("Tu comisión es: " + comission);
		}
}
