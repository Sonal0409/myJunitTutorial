package junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import junitDemo.Calculator;

public class AssertiionsTest {
	
	Calculator calc;
	
	@BeforeEach
	public void init()
	{
		calc = new Calculator();
	}
	
	// if you just give if statement... test case logic may fail, may print failed 
	//but testcase will be marked as Passed onyl right..green color
	// which is wrong. if logic fails even testcase should fail
	//So we use assertions in Junit
	
	
	@Test
	public void sumTest()
	{
		int sum = calc.add(2, 2);
		if(sum == 40)
		{
			System.out.println("testcase passed");
		}
		else 
		{
			System.out.println("testcase failed");
		}
	}
	
	// Lests write assertions
	
	@Test
	public void AssertionsDemo()
	{
		int sum = calc.add(2, 2);
	Assertions.assertEquals(4, sum); // this is will pass
	}
	
	
	@Test
	public void AssertEqualsDemo()
	{
		int sum = calc.add(2, 2);
	Assertions.assertEquals(2, sum); // this is will fail.. expected 2 but got 4
	}
	
	@Test  // give custom message
	public void AssertEqualsMessageDemo()
	{
		int sum = calc.add(2, 2);
	Assertions.assertEquals(2, sum, "sum is incorrect"); // this is will fail..
	//expected 2 but got 4 and it gives custome message
	}
	
	
	@Test  // assertNotEquals
	public void AssertNotEqualsDemo()
	{
		int sum = calc.add(2, 2);
	Assertions.assertNotEquals(5, sum, "sum is correct"); // this is will pass..
	//expected sum and actula sum are not equla.
	//if they are equla the test case will fail
	}
	
	@Test  // assert multiple values.. a list of values
	public void AssertArrayEqualsDemo()
	{
		// compare actual list of values to expected list of values.
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
		
		// again give same array method just change the numbers
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
		
		// again give same array method just give more values in 1 array
		Assertions.assertArrayEquals(new int[] {1,2,3}, new int[] {1,5,3,5});
		
		// in case of arrays you get different and exact readable messages
	}	
	
	@Test
	public void AssertNullDemo()
	{
		String nullString = null;
		Assertions.assertNull(nullString); // this will pass as nullString is null only
		
		String string2 = "Junit5";
		Assertions.assertNull(string2);
		// this will fail as string2 is not null
	}
	
	
	@Test
	public void AssertNotNullDemo()
	{
		String nullString = null;
		Assertions.assertNotNull(nullString); // this will fail as nullString is null 
		//expected a not null value
		
		String string2 = "Junit5";
		Assertions.assertNotNull(string2);
		// this will pass as string2 is not null
	}
	
	
	
	@Test
	public void AssertTrueDemo()
	{
		boolean trueValue = true;
		Assertions.assertTrue(trueValue); // this will pass as trueValue variable is true 
			
		boolean falseValue = false;
		Assertions.assertTrue(falseValue);
		//// this will fail as falseValue variable is false, expecting true
	}
	
	@Test
	public void AssertfalseDemo()
	{
		boolean trueValue = true;
		Assertions.assertFalse(trueValue); // this will fail as trueValue variable is true 
			//expecting false but got true
		boolean falseValue = false;
		Assertions.assertFalse(falseValue);
		//// this will pass as falseValue variable is false, expecting false only
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
