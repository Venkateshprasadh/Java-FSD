package SampleSpringproject.PlaindromeCheckJunitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlaindromeUnitTesting {


	static PlaindromeCheck pc;
	@BeforeClass 
	public static void beforeclass() {
		pc=new PlaindromeCheck();
	 
		System.out.println("invoked only once, before starting all the tests");
	}
	@AfterClass
	public static void Afterclass() {
		pc=new PlaindromeCheck();
	 
		System.out.println("invoked only once, after finishing all the tests.");
	}
	@Before
	public void before() {
		pc=new PlaindromeCheck();
	 
		System.out.println("object is created");
	}

	@Test
	public void test1() 
	{
		assertEquals("yes palindrome number", pc.palindrome(111));
		System.out.println("in test case -1");
	}

	@Test
	public void test2() {
		assertEquals("no not palindrome", pc.palindrome(119));
		System.out.println("in test case -2");
	}
	@After
	public   void after() 
	{
		pc=null;
		System.out.println("object is destroyed");
	}

	

}
