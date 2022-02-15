
public class operaciones {
	public static void main (String[] args) {
		
		
		//solo utilizar cuando sean necesaria
		//try {
			//System.out.println(args [0]);
			//System.out.println(args [1]);
			//System.out.println(args [2]);
		//} catch(ArrayIndexOutOfBoundsException ae) {
			//System.out.println("No existe el elemento cero de args");
		//}//catch
		
	if (args.length>=3) {
		System.out.println(args [0]);
		System.out.println(args [1]);
		System.out.println(args [2]);
	}else {
		System.out.println("No existen suficientes elementos args");
	}//else//if args.length >=3
		
		int x = 20;
		int y = 0;
		try{
			System.out.println(x/y);
		}catch(ArithmeticException ae) {
			//System.out.println(ae);
			System.out.println("No puedes dividir entre cero");
			y=1;
			System.out.println(x/y);
			
		}finally {
			System.out.println("terminamos");
		}//finally
	}//main

}//class operaciones
