package junitTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutDemo {
	
	@Test
	@Timeout(4) // test should get executed within 4 secons else fail the tescase
	public void TimeoutTest() throws InterruptedException
	{
		Thread.sleep(5000); //test will wait for 5 sec and will fail as timeout is 4 sec
		System.out.println("test executed within time");
	}

	
	@Test
	@Timeout(6) // test should get executed within 6 seconds else fail the tescase
	public void TimeoutTest1() throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(5); // just taking different wait time,
		System.out.println("test executed within time"); // this will pass
	}
	
	@Test
  // here use timeoutAssert method instead of timeout annotation
	public void TimeoutTest2() throws InterruptedException
	{
		
		Assertions.assertTimeout(Duration.ofSeconds(5), ()->delaySeconds(6));
	}
	
	private void delaySeconds(int seconds) throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(seconds);
	}
	
	
	
	
	
	
}
