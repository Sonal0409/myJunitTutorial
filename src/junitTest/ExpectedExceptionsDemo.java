package junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExpectedExceptionsDemo {

	private int divide(int a, int b)
	{
		return a/b;
	}
	
	@Test 
	public void expectedExceptiontest()
	{
		Assertions.assertThrows(ArithmeticException.class, ()-> divide(2,0));
		
		System.out.println("valid exception");
	}
	
	@Test 
	public void expectedExceptiontest2()
	{
		Assertions.assertThrows(ArithmeticException.class, ()-> divide(2,2));
		// Now exception will not be throws so testcase fail
		System.out.println("valid exception");
	}
}
