package junitTest;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import junitDemo.Calculator;

public class NestedTests {
	
	Calculator calc;
	
	@Nested
	class positivenumbers
	{
	@Test
	public void addtwopositivenumbers()
	{
		calc= new Calculator();
		int sum = calc.add(2, 3);
		System.out.println(sum);
	}
	@Test
	public void addbigpositivenumbers()
	{
		calc= new Calculator();
		int sum = calc.add(2000, 3000);
		System.out.println(sum);
	}
	}
	@Nested
	class negativenumbers
	{
	@Test
	public void addtwonegativenumbers()
	{
		calc= new Calculator();
		int sum = calc.add(-2, -3);
		System.out.println(sum);
	}
	@Test
	public void addbignegativenumbers()
	{
		calc= new Calculator();
		int sum = calc.add(-2000, -30090);
		System.out.println(sum);
	}
	}
	@Nested
	class evenOdd{
		
	@Test
	public void addoddnumbers()
	{
		calc= new Calculator();
		int sum = calc.add(5, 7);
		System.out.println(sum);
	}
	@Test
	public void addevennumbers()
	{
		calc= new Calculator();
		int sum = calc.add(2, 4);
		System.out.println(sum);
	}
	}
}
