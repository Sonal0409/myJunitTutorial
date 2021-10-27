package junitTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junitDemo.Calculator;

public class BeforeandAfterTest {
	
	Calculator obj;
	

	@BeforeAll
	public static void beforeAllMethod()
	{
		System.out.println("Starting the connection with DB");
	}

	@AfterAll
	public static void afterAllmethod()
	{
		System.out.println("Stop the connection with DB");
	}
	
	@BeforeEach
	public void init()
	{
		 obj = new Calculator();
		 System.out.println("initializting calculator object before every method");
	}
	@Test
	public void testadd()
	{
		
		int sum =obj.add(10, 20);
		System.out.println(sum);
	}

	@DisplayName("add negative numbers")
	@Test
	public void testadd2()
	{
		
		int sum =obj.add(-10, -20);
		System.out.println(sum);
	}
	
	@AfterEach
	public void teardonw()
	{
		System.out.println("this code will execute after every test method");
	}
	
	
	
	
	
	
	

}
