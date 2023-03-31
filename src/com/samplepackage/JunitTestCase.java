
package com.samplepackage;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JunitTestCase {
	Calculator calc= new Calculator();
	@Test
	public void testSum() {
		assertEquals("Test Passed",8,calc.sum(2, 6));
		assertEquals("Test Passed",100,calc.sum(40,60));
		}
	
	@Test
	public void testSumFail() {
		assertEquals("Test Failed",4,calc.sum(2, 6));
		assertEquals("Test Failed",30,calc.sum(40,60));	
	}
	@Test
	public void testSubtract() {
		assertEquals("Test Passed",-4,calc.subtract(2, 6));
		assertEquals("Test Passed",-20,calc.subtract(40,60));
	}
	
	@Test
	public  void testMultiply() {
		assertEquals("Test Passed",80,calc.multiply(10,8));
		assertEquals("Test Passed",18,calc.multiply(6,3));
	}
	@Test
	public void testDivide() {
	assertEquals("Test Passed",3,calc.divide(6, 2));
	}
}
