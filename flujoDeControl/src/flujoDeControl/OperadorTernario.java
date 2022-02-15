package flujoDeControl;
import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner value = new Scanner (System.in);
		System.out.println("Introduce tu edad");
		int age =value.nextInt();
		
		System.out.println(age >= 18 && age <= 150 ? "Eres mayor de edad" : age > 0 && age <18 ? "Eres menor de edad" : "Valor fuera de rango");
		}

}
