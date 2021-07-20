package org.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Example {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class..");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class..");
	}
	@Before
	public void beforeMethod() {
		System.out.println("Before Each Method..");
	}
	@After
	public void afterMethod() {
		System.out.println("After Each Method..");
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("TC 3");
	}
	@Test
	public void tc2() {
		System.out.println("TC 2");
	}
	@Test
	public void tc1() {
		System.out.println("TC 1");
	}

	private void div() {
		System.out.println("division");
	}
	private void multiple() {
		System.out.println("Multiple");
	}
	private void add() {
		System.out.println("addition");
	}
	private void sub() {
		System.out.println("subtraction");
	}
}
