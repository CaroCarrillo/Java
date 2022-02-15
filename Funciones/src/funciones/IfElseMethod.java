package funciones;
import java.util.Scanner;

public class IfElseMethod {
	

	static void access(int age) {
		if(age<18) {
			System.out.println("Acceso denegado");
		}else {
			System.out.println("Acceso permitido");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int input = data.nextInt();
		
		access(input);

	}

}
