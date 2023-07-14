package com.swt.parallel;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void testMethod5() {
		System.out.println("Test 2 >>> testMethod5 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod6() {
		System.out.println("Test 2 >>> testMethod6 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod7() {
		System.out.println("Test 2 >>> testMethod7 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod8() {
		System.out.println("Test 2 >>> testMethod8 >>>  " + Thread.currentThread().getId());
	}
	
	@Test
	public void testMethod9() {
		System.out.println("Test 2 >>> testMethod9 >>>  " + Thread.currentThread().getId());
	}
}
