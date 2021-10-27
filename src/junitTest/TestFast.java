package junitTest;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;

public class TestFast implements fastTest {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@fastTest
	public void fasttest1()
	{
		System.out.println("test fast");
	}

	
	



}
