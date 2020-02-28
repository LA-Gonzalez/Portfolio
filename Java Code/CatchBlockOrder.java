/*Write a program demonstrating that the order of catch blocks is important. 
If you try to catch a superclass exception type before a subclass type, 
the compiler should generate errors.*/

import java.io.*;


public class Question04 {

	public static class ExceptionA extends Exception {

		   private String message;

		   public ExceptionA() {

		   }

		   public ExceptionA(String message) {

		       this.message = message;

		   }

		   public String getException() {

		       return message;

		   }

		}

		public static class ExceptionB extends ExceptionA {

		   private String message;

		   public ExceptionB() {

		   }

		   public ExceptionB(String message) {

		       this.message = message;

		   }

		   public String getException() {

		       return message;

		   }

		}
	
		public static void main(String[] args) {
			
		try {
			throw new ExceptionA();	
		} 
		
		catch (ExceptionA ex) {
		System.err.println("Superclass exception!");
		} 
		//catch (ExceptionA ex) {
		//System.err.println("Subclass exception!");
		//}
	
	}
	
}
