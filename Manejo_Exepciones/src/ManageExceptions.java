import java.util.Scanner;

public class ManageExceptions {
	public void printDivide(){
			try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Escribe el primer n?mero");
			int a = scanner.nextInt();

			System.out.print("Escribe el segundo n?mero");
			int b = scanner.nextInt();

			System.out.println("El resultado de l divisi?n es: " + (a/b));
			String[] nombres = {"Rosy", "Jos?", "Ivan"};
			System.out.println("nombres[0]: " + nombres[0]);
			System.out.println("nombres[1]: " + nombres[1]);
			System.out.println("nombres[2]: " + nombres[2]);
			System.out.println("nombres[3]: " + nombres[3]);
		}catch (ArithmeticException e) {
			System.out.println("Ning?n n?mero puede ser cero");
		}catch (IndexOutOfBoundsException e) {//por si me salgo de los ?ndices de un arreglo
			System.out.println("No existe ese ?ndice en el arreglo");
		}catch (Exception e) {
			System.out.println("Ocurri? otro error " + e);
		}finally {
			//scanner.close();
		}//finally
	}//printDivide
}//class ManageExceptions
