// Twenty students were asked to rate on a scale of 1 to 5 the quality of the food
// in the student cafeteria, with 1 being “awful” and 5 being “excellent.” The 20
// responses are stored in “numbers.txt” file. Read the responses from “numbers.txt”
// file, determine the frequency of each rating and output it to the text file “output.txt”.

import java.util.Scanner;
import java.io.*;

public class Question05 {


	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Numbers.txt");
		
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		int dataItem;
		
		Scanner in = new Scanner(file);
		
		PrintWriter output = new PrintWriter(new File("Output.txt"));
		
		if(!file.exists()) {
			System.out.println("File not found");
		}
		else {
								
			
			while(in.hasNext()) {
				
				dataItem= in.nextInt();
				
				if(dataItem==1) {
					f1++;
				}
				if(dataItem==2) {
					f2++;
				}
				if(dataItem==3) {
					f3++;
				}
				if(dataItem==4) {
					f4++;
				}
				if(dataItem==5) {
					f5++;
				}
			
			}
			
			output.printf("%-10s %10s","Rating","Frequency");
			output.printf("\n%-10d %10d",1,f1);
			output.printf("\n%-10d %10d",2,f2);
			output.printf("\n%-10d %10d",3,f3);
			output.printf("\n%-10d %10d",4,f4);
			output.printf("\n%-10d %10d",5,f5);
			
			
			
		}
	  
		output.close();
	}

}
