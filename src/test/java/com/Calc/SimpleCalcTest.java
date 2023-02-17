/**
 * @author - Alex Cox
 * CIS175 - Spring 2023
 * 2/04/2023
 */

package com.Calc;

import static org.junit.Assert.*;

import org.junit.Test;


public class SimpleCalcTest {
	  SimpleCalc scTest = new SimpleCalc();
	@Test
	 public void testMultiply() {
        int result = scTest.multiply(8000, 2);
        assertEquals(result, 16000);
    }
	
	@Test
	 public void testDivide() {
       int result = scTest.divide(8000, 2);
       assertEquals(result, 4000);
   }
	
	
	@Test
	 public void testSquare() {
      int result = scTest.square(8000);
      assertEquals(result, 64000000);
  }
	
	
	@Test
	 public void testEuroConverter() {
		  double result = scTest.euroConverter(50);
    assertEquals(46.81, result, 0.0);
 }
	
	
	@Test
	 public void testRussianRubleConverter() {
		  double result = scTest.rubleConverter(69);
   assertEquals(5155.34, result, 1.0);
}
	
	@Test
    public void testRussianRubleConverterTwo() {
		  double result = scTest.rubleConverter(69);
		   assertNotEquals(5157.34, result, 1.0);
    }	
	
	@Test
    public void testIsNinetiesKid() {
		boolean test = scTest.isNinetiesKid(1991);
		 assertTrue(test);
    }
        
         
    }
