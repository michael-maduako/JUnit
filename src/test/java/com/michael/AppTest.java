package com.michael;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@BeforeAll
	static void b4All() {
		System.out.println("Executed once b4 all test methods"+ " in the class");
	}
	
	@BeforeEach
	void b4Each() {
		System.out.println("Executed once each test methods"+ " in the class");
	}
	
	@DisplayName("Test method2 with condition")
	@Test
	static void myTestMethod2() {
		System.out.println("My test Method2 is Executed"+ " in the class");
	}
	
	
	@Test
	@Disabled
	void myTestMethod1() {
		System.out.println("My test Method1 is Executed"+ " in the class");

	}
	
	@Test
	void myTestMethod3() {
		System.out.println("My test Method3 is Executed"+ " in the class");

	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Executed once after all test methods"+ " in the class");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Executed after each test methods"+ " in the class");
	}
	
 
}
