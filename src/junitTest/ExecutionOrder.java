package junitTest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Alphanumeric.class) : its depricated
@TestMethodOrder(MethodOrderer.Random.class)
public class ExecutionOrder {
	
	@Test
@Order(4)
	public void Test1()
	{
		System.out.println("Execute Test 1");
	}
	@Test
	@Order(2)
	public void Test2()
	{
		System.out.println("Execute Test 2");
	}
	@Test
	@Order(1)
	public void Test3()
	{
		System.out.println("Execute Test 3");
	}
	@Test
	@Order(3)
	public void Test4()
	{
		System.out.println("Execute Test 4");
	}
	

}
