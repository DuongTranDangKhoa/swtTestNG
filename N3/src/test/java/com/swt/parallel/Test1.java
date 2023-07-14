package com.swt.parallel;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testMethod1() {
		System.out.println("Test 1 >>> testMethod1 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Test 1 >>> testMethod2 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Test 1 >>> testMethod3 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod4() {
		System.out.println("Test 1 >>> testMethod4 >>>  " + Thread.currentThread().getId());
	}
}
