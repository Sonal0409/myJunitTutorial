package junitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamertrizedTest {
	
	//********* Parametrizing using values using @ValueSource ***********
	
	@ParameterizedTest(name = "{index} - Run test with args = {0}")
	@ValueSource(ints = {1,5,4,6})
	public void valuesourceTest(int args)
	{
		System.out.println("the integer value is " + args);
	}
	
	@ParameterizedTest(name = "{index} - Run test with args = {0}")
	@ValueSource(strings = {"uft","QTP","jmeter"})
	public void valuesourceStringTest(String tools)
	{
		System.out.println("the String value is " + tools);
	}

	// *************** using enumsource @EnumSource
	
	enum plang{
		java,ruby,python,perl;
	}
	
	@ParameterizedTest
	@EnumSource(plang.class)
	public void enumsourceTest(plang langname)
	{
		System.out.println("the Enum value is " + langname);
	}
	
	// ************ using Method source *********
	

 public static Object[] values()
	{
		return new Object[][] {
			{"Selenium","testingtool"},
			{"QTP" , "functiontool"},
			{"jmeter","performacetool"},
			{"Appium","mobiletool"},
		};
	}
	
	
	@ParameterizedTest
	@MethodSource("values")
	public void methodsourceTest1(String tool, String type)
	{
		System.out.println(tool +" --"+type);
	}	
	// ************* using CSVSource ***********
	
	@ParameterizedTest
	@CsvSource({
		"Selenium,testingtool",
		"QTP , functiontool",
		"jmeter,performacetool",
		"Appium,mobiletool"
	})
	public void methodsourceTestCSV(String tool, String type)
	{
		System.out.println(tool +" --"+type);
	}
	
	
	
}
