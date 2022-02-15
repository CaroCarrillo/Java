package flujoDeControl;

import java.util.Scanner;

public class ConditionIf {

	public static void main(String[] args) {
		Scanner value = new Scanner (System.in);
		System.out.println("Introduce tu edad");
		int age = value.nextInt();
		
		if (age >=18 && age<=150) {
			System.out.println("Eres mayor de edad");
		}else if (age >= 0 && age <18) {
			System.out.println("Eres menor de edad");
		}else {
			System.out.println("El valor de edad está fuera de rango");
		}

	}

}