package com.swt.function;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFunctionTestNG {
	 
	 private int number;

	  @BeforeClass
	  public void setup() {
	    // initialize the number to 12
	    number = 12;
	  }

	  @Test
	  public void givenNumber_whenEven_thenTrue() {
	    // assert that the number is divisible by 2
	    Assert.assertTrue(number % 2 == 0);
	    
	  }
	
}
