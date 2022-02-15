package flujoDeControl;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		try (Scanner value = new Scanner(System.in)) {
			System.out.println("Elige una opción: ");
			String enter = value.nextLine();
			
			switch (enter){
				case "1":
					System.out.println("Elegiste opción 1");
					break;
				case "2":
					System.out.println("Elegiste opción 1");
					break;
				default:
					System.out.println("Elección incorrecta");
					break;
			}
		}

	}

}
