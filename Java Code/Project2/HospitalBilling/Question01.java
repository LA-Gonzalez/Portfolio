//Program 
//

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//input variables
		int id;
		String fn;
		String ln;
		String pf;
		String pl;
		String sp;


		
		System.out.print("Enter patient's ID: ");
		id = input.nextInt();
		
		
		
		System.out.print("\nEnter patient's first name: ");
		fn = input.next();
		
		
		
		System.out.print("\nEnter patient's last name: ");
		ln = input.next();

		
		System.out.print("\nEnter doctor's first name: ");
		pf = input.next();

		
		System.out.print("\nEnter doctor's last name: ");
		pl = input.next();
		
		System.out.print("\nEnter doctor's specilty: ");
		sp = input.next();
		
		Doctor doc = new Doctor(pf,pl,sp); 
		Patient pat = new Patient(fn,ln, new Date(8,5,2010), new Date(8,11,2010),doc);
		Bill bill = new Bill(id, 245.5, 2500, 3500.38, pat ,doc, pat.dateAdmitted, pat.dateDischarged);
		bill.printBill();
				
		


	}

}
