/**
 * @author - Alex Cox
 * CIS175 - Spring 2023
 * 2/04/2023
 */
package com.Calc;


public class SimpleCalc {
	
	//methods for calculations
		//multiply
		 public int multiply(int numOne, int numTwo) {
		        return numOne * numTwo;
		    }
		 
		 //divide
		 public int divide(int numOne, int numTwo) {
		        return numOne / numTwo;
		    }
		 
		 
		 //square number
		 public int square(int num) {
			    return num * num;
			  }
		 
		 //convert USD to Euro
			public  double euroConverter(double dollars) {
				double  euroExchange = 0.9362;
				  return euroExchange * dollars;
			}
			
			//convert USD to Russian Rubles
			public  double rubleConverter(double dollars) {
				double  rubleExchange = 74.715;
				  return rubleExchange * dollars;
			}
			
			
			//checks if birth year entered to determine if nineties kid
			public boolean isNinetiesKid(int birthyear) {
			       boolean isNinetiesKid;
			       if(birthyear >= 1990 && birthyear <= 1999) {
			    	   isNinetiesKid = true;
			    	   return isNinetiesKid;
			       } 
			       else {
			    	   isNinetiesKid = false;
			    	   return isNinetiesKid;
			       }
		 
		 
	}
			
}