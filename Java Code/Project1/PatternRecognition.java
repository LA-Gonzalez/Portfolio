// Pattern recognition: four consecutive equal numbers
// tests whether a two-dimensional array has four consecutive
// numbers of the same value, either horizontally, vertically,
// or diagonally

package project1;

import java.util.Scanner;

public class Question1 {
	


	public static void main(String[] args) {
		//Create Scanner object
		Scanner input = new Scanner(System.in); 

		//Prompt user to enter number of rows
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();

		//Prompt user to enter number of columns. 
		System.out.println("Enter the number of colmns");
		int columns = input.nextInt();
		int grid [][] = new int [rows][columns];
		
		//Prompt user to enter values for 2D array. 
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				System.out.print("Enter value for Row "+i+" Colmn "+j+": ");
				grid[i][j]= input.nextInt();
			}
		}
		//print grid
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j<grid[i].length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
		//print result of consecutive four method
		if(isConsecutiveFour(grid))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	//Boolean method to check if two dimensional array has 4 consecutive numbers of the same value. 
	public static boolean isConsecutiveFour(int[][] values) {

		//check horizontally (by row)
		for (int i = 0; i<values.length; i++) {
			for(int j = 0; j<values[i].length-3; j++) {
				if(values[i][j]== values[i][j+1] &&
					values[i][j]== values[i][j+2] &&
					values[i][j]== values[i][j+3]) {
					return true;
				}
			}//end column loop
		}//end row loop
		
		//check vertically (by column)
		for (int i = 0; i<values.length-3; i++) {
			for(int j = 0; j<values[i].length; j++) {
				if(values[i][j]== values[i+1][j] &&
					values[i][j]== values[i+2][j] &&
					values[i][j]== values[i+3][j]) {
					return true;
				}
			}//end column loop
		}//end row loop
		
		//check horizontally (by diagonally down right)
		for (int i = 0; i<values.length-3; i++) {
			for(int j = 0; j<values[i].length-3; j++) {
				if(values[i][j]== values[i+1][j+1] &&
					values[i][j]== values[i+2][j+2] &&
					values[i][j]== values[i+3][j+3]) {
					return true;
					}
			}//end column loop
		}//end row loop
		
		//check horizontally (by diagonally down left)
		for (int i = 0; i<values.length-3; i++) {
					for(int j = 0; j<values[i].length; j++) {
						if(values[i][j]== values[i+1][j-1] &&
							values[i][j]== values[i+2][j-2] &&
							values[i][j]== values[i+3][j-3]) {
							return true;
						}
					}//end column loop
				}//end row loop
					
		return false;
	}//end isConsecutiveFour method
	
}
