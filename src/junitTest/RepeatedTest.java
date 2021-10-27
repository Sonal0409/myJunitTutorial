package junitTest;

import org.junit.jupiter.api.Test;

public class RepeatedTest {
	
	//@Test
	@org.junit.jupiter.api.RepeatedTest(3)
	public void repattestDemo()
	{
		System.out.println("Repeating the tests again");
		
	}

}
