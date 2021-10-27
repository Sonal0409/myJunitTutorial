package junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsDemo {
	
	@Test
	public void AssuptionsTruedemo()
	{
		Assumptions.assumeTrue(true);
		// if assumption is true then execute print statement
		System.out.println("Executing as assumption is correct");
		
		Assumptions.assumeTrue(false); // test case skipped
		// if assumption is false then it will not execute print statement, this line will be skipped
		System.out.println("Executing as assumption is correct");
		
		// ********NOTE **********
		//also if we give if condition instead of assumtrue
		if(true) // test case pass and executed
		{
			System.out.println("Executing as assumption is correct");
		}
	/*	if(false) // test case pass and executed
		{
			System.out.println("Executing as assumption is correct");
		}*/
		
		//************ NOTE ******************
		
		Assertions.assertTrue(true); // tets case will pass
		System.out.println("Executing as assert is correct");
		
		Assertions.assertTrue(false); // tets case will fail as expecting true
		System.out.println("Executing as assert is correct");
		// in both the above cases the test case pass or fail but will not skip..
		// but in case of assume true, if condition is false it will skip
	}
	
	@Test
	public void AssuptionsFalsedemo()
	{
		Assumptions.assumeFalse(false);
		// if assumption is true then execute print statement
		System.out.println("Executing as assumption is false");
		
		Assumptions.assumeFalse(true);
		// if assumption is true then skip the testcase
		System.out.println("Executing as assumption is correct");
	}

}
