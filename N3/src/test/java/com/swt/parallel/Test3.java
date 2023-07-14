package com.swt.parallel;

import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void testMethod10() {
		System.out.println("Test 3 >>> testMethod10 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod11() {
		System.out.println("Test 3 >>> testMethod11 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod12() {
		System.out.println("Test 3 >>> testMethod12 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod13() {
		System.out.println("Test 3 >>> testMethod13 >>>  " + Thread.currentThread().getId());
	}
}
