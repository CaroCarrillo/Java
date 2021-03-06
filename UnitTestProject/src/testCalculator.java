import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testCalculator {

	@Test
	public void testSuma() {
		Calculator c = new Calculator();
		Assertions.assertEquals(4, c.sum(2, 2));
		Assertions.assertEquals(8, c.sum(6, 2));
		Assertions.assertEquals(1024, c.sum(512, 512));
	}//testSuma
	
	@Test
	public void testMultiplica() {
		Calculator c = new Calculator();
		
		Assertions.assertEquals(4, c.mult(2, 2));
		Assertions.assertEquals(12, c.mult(6, 2));
		Assertions.assertEquals(25, c.mult(5, 5));
	}//testMultiplica
	
	@Test
	public void testPI() {
		Calculator c = new Calculator();
		Assertions.assertTrue(
				(c.getPI()>=3.14159 && c.getPI() <=3.1416)
		);
		
	}//testPI
	
	@Test
	public void testStrPI() {
		Calculator c = new Calculator();
		Assertions.assertNotNull(c.getStrPI());
		Assertions.assertTrue(c.getStrPI().length()>0);
		Assertions.assertTrue(c.getStrPI().indexOf(".")==1);
	}//testStrPI
	
	
	@Test
	public void testDivide() {
		Calculator c = new Calculator();
		Assertions.assertNotNull(c.getStrPI());
		Exception exception = Assertions.assertThrows(ArithmeticException.class, ()-> c.div(9, 0));
		Assertions.assertEquals("/ by zero", exception.getMessage());
		Assertions.assertEquals(3, c.div(9, 3));
		Assertions.assertEquals(3, c.div(12, 4));
	}//TestDivide
	
	@Test
	public void testEmail() throws EmailFormatException{
		Calculator c = new Calculator();
		Exception exception = Assertions.assertThrows(EmailFormatException.class, ()-> c.setEmail("alonsograjeda@generationorg"));
		Assertions.assertEquals("El formato del correo electrónico es incorrecto", exception.getMessage());
		Assertions.assertEquals("alonso.grajeda@generation.org",c.setEmail("alonso.grajeda@generation.org"));
	}//TestEmail

}//class testCalculator
