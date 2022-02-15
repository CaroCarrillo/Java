package funciones;
import java.util.Scanner;

public class Calculadora {
	static double suma (double num1, double num2) {
		return num1+num2;
}
	static double resta (double num1, double num2) {
		return num1-num2;
}
	static double multiplicacion (double num1, double num2) {
		return num1*num2;
}
	static double division (double num1, double num2) {
		return num1/num2;
}
	
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		double x = sc.nextDouble();
		
		System.out.println("Introduce el primer número: ");
		double y = sc.nextDouble();
		
		System.out.println("La suma es: " + suma(x,y));
		System.out.println("La resta es: " + resta(x,y));
		System.out.println("La multiplicación es: " + multiplicacion(x,y));
		System.out.println("La división es: " + division(x,y));
		
		
	}
}

