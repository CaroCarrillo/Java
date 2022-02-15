package funciones;
import java.util.*;

public class Main {
	
	static void persona (String nombre, int edad, double peso) {
		System.out.println(nombre + " tiene " + edad + " años de edad, y pesa " + peso + " kilos");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cual es tu nombre?");
		String nombre = sc.nextLine();
		
		System.out.println("Cual es tu edad");
		int edad = sc.nextInt();
		
		System.out.println("Cual es tu peso?");
		double peso = sc.nextDouble();
		
		persona(nombre,edad,peso);
}
}