package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
	
	@BeforeClass
	public static void setUpBeforeClass()throws Exception{
		System.out.println("Running BeforeClass");
	}
	@Before
	public void setUpBefore()throws Exception{//cannot be static
		System.out.println("Running Before");
	}
	@AfterClass
	public static void setUpAfterClass()throws Exception{
		System.out.println("Running AfterClass");
	}
	@After
	public void setUpAfter()throws Exception{//cannot be static
		System.out.println("Running After");
	}
	

	@Test
	public void testAdd() {
		
	System.out.println(Calculation.add(1, 2));
	}
}
