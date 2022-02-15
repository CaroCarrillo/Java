package funciones;
import java.util.Scanner;

public class practicaGit {

	public class Main
	{
	    public static void main( String[] args )
	    {
	        Scanner console = new Scanner( System.in );
	        System.out.println( "Enter your name:  " );
	        String name = console.next();
	        printNameCharacters( name );
	        printNameLength( name );
	        console.close();
	    }

	    private static void printNameLength( String name )
	    {
	        //TODO implement this code
	    }

	    private static void printNameCharacters( String name )
	    {
	    	for (int contador=0;contador<name.length();contador++) {
				System.out.println(name.charAt(contador));
			}

	    }


	}

}
 