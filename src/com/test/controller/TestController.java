/**
 * 
 */
package com.test.controller;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;

/**
 * @author ankit
 *
 */
public class TestController {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		String test = "This is test string";
		System.out.println("a is ==> " + a + " and test is ==> " + test);
		
		System.out.println("This is the Latest.");
		System.out.println("This is the Latest One.");
		System.out.println("This is the Latest Two.");
		
		TestController testController = new TestController();
		
		Result result = JUnitCore.runClasses(TestController.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
		
		testController.test1();
		
	}
	
	@Test
	private void test1(){
		System.out.println("This is test method.");
	}

}
