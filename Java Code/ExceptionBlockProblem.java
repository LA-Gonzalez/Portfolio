// Demonstrates how various exceptions are caught with catch (Exception exception).
// Define classes ExceptionA (which inherits from class Exception) and
// ExceptionB (which inherits from class ExceptionA).

import java.util.Scanner;
import java.io.*;

public class Question03 {



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

	       Scanner input= new Scanner(System.in);
	       boolean flag = true;
	       while(flag){
	      

	       System.out.println("\nMenu");
	       System.out.println("----------------------");
	       System.out.println("1: Test ExceptionB");
	       System.out.println("2: Test ExceptionA");
	       System.out.println("3: Test NullPointerException");
	       System.out.println("4: Test IOException");
	       System.out.println("5: Terminate Program");
	       System.out.print("Selection: ");
	      

	       int selection = input.nextInt();

	       try {
	       switch(selection) {
	       	      
	    	   
	       	    	   case 1:  
	       	    		   throw new ExceptionB("Exception B");
	       	    	   		
	       	    	   case 2:    
	       	    		 throw new ExceptionA("Exception A");	       	    		 

	       	    	   case 3:
	       	    		 throw new NullPointerException("Exception: NullPointerException");	       	    		 

	       	    	   case 4:
	       	    		   throw new IOException("Exception: IOException");
	       	    		   
	       	    	   case 5:
	       	    		   flag = false;	       	    		   	       	    		   
	       	    		   
	       	       }
	       	       	       	       	       	    	       	       
	       }

	       catch (ExceptionB exception) {

	           System.out.println(exception.getMessage());
	       }
	       catch (ExceptionA exception) {

	           System.out.println(exception.getMessage());
	       }
	       
	       catch (NullPointerException exception) {

	           System.out.println(exception.getMessage());

	       }
	       catch (IOException exception) {

	           System.out.println(exception.getMessage());

	       }
	       }
	
	   }
	
}
