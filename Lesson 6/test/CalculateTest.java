import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	}
	
	@Test
	public void testAdd() {
//		fail("Not yet implemented");
//		Arrange (initialize the variable, setup)
		int a = 1234;
		int b = 8765;
		Calculate cal = new Calculate();
//		Act (calling the method)
		int actual = cal.add(a, b);
//		Assert (compare the outcome)
		int expected = 9999;
		assertEquals (expected, actual);
	}
	
	@Test 
	public void testSubtract() {
//		fail("Not yet implemented");
//		Arrange 
		int a = 9876;
		int b = 4321;
		Calculate cal = new Calculate();
//		Act
		int actual = cal.subtract(a, b);
//		Assert
		int expected = 5555;
		assertEquals (actual, expected);
	}
	
	@Test 
	public void testMultiple() {
//		fail("Not yet implemented");
//		Arrange 
		int a = 1;
		int b = 8;
		Calculate cal = new Calculate();
//		Act
		int actual = cal.multiple(a, b);
//		Assert
		int expected = 8;
		assertEquals (actual, expected);
	}
	
	@Test 
	public void testDivide() {
//		fail("Not yet implemented");
//		Arrange 
		int a = 10;
		int b = 2;
		Calculate cal = new Calculate();
//		Act
		int actual = cal.divide(a, b);
//		Assert
		int expected = 5;
		assertEquals (actual, expected);
	}
	
	@Test 
	public void testDivideWith0Denominator() {
//		fail("Not yet implemented");
//		Arrange 
		int a = 100;
		int b = 0;
		try {
			Calculate cal = new Calculate();
			cal.divide(a, b);
			//if operation completes, test is not executed properly.
			fail("Expected an Illegal Exception to be thrown");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not allowed",
					e.getMessage());
		}
		catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", 
					t.getMessage());
		}
		
		
		}

}

















