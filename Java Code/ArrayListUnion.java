//Write a method that returns the union of two array lists of integers using
// the following header: public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
// Write a test program that prompts the user to enter two lists, each with five integers, and displays their union.
// The numbers are separated by exactly one space.

import java.util.*;

public class Q11 {

	//main
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		System.out.print("Enter 5 Integers for list1: ");
		for (int i = 0; i< 5; i++) {
			list1.add(input.nextInt());
		}
		
		System.out.print("Enter 5 Integers for list2: ");
		for (int i = 0; i< 5; i++) {
			list2.add(input.nextInt());
		}
		
		ArrayList<Integer> combined = union(list1, list2);
		
		System.out.print("\nThe combined list is: ");
		for(int i = 0; i<combined.size();i++) {
			System.out.print(combined.get(i)+" ");
			
		}
	}//end main
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> combined = new ArrayList<Integer>();
		combined.addAll(list1);
		combined.addAll(list2);
		
		return combined;
		
	}
	
}
