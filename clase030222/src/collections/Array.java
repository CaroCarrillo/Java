package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
	
	public static void main(String[] args) {
		//String[] arreglo = {"Carolina ", "Claudia ", "Ivan "};
		//System.out.println(arreglo[0]);
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Volvo");
		cars.add("Fiat");
		
		/*System.out.println(cars);
		System.out.println(cars.get(2));//acceder a un artículo del array
		
		System.out.println(cars.set(0,"Kia"));//cambiar un articulo del array
		System.out.println(cars);
		
		System.out.println(cars.remove(0));//eliminar un artículo del array
		System.out.println(cars);
		
		System.out.println(cars.size());//da el tamaño del array
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}*/
			
		Collections.sort(cars);
		
		for(String j:cars) {
			System.out.println(j);
		}	
	}

}
