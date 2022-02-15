
public class Nomina {
	public static void calculaPagos(Pagable e) {// se le va a pasar todos objetos que tiene la interface pagable
		System.out.println("============================");
		System.out.println("Cálculo de Pago" + e);
		System.out.println("============================");
		System.out.println(e.calculateSalary() - (e.calculateSalary() * 0.30));
		System.out.println("============================");
		
	}//calculaPago

}//Nomina
