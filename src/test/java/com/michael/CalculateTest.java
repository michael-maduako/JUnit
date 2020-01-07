package com.michael;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.Test;

public class CalculateTest {
	@Test
	public void Call() {
		Calculate c1= new Calculate();
		c1.add(12, 13);
		assertEquals(25,c1.add(12,13),"Checking sum of the integers");
		assertFalse(25==c1.add(12, 12));
		assertThrows(ArithmeticException.class,()->c1.divide(12,0));
		//assertNull(c1);
		assertNotNull(c1);
	}
	
//	@Test
//	public void dayTest() { //This function should only work on Wednesday
//		LocalDateTime dt= LocalDateTime.now();
//		assumeTrue(dt.getDayOfWeek().getValue()==5);
//		System.out.println("calling after localdate time");
//		
//	}
}
