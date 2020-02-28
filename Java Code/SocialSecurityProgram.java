import java.util.Scanner;
public class SocialSecurityProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String ssn;
		
		System.out.print("Enter SSN: ");
		ssn = input.nextLine();
		
		if(ssn.length()==11)
		{
			if((ssn.indexOf('-') != 3) && (ssn.indexOf('-') != 6))
			{
				System.out.printf("%s is an invalid Social Security Number", ssn);
			}
			else if(!Character.isDigit(ssn.charAt(0)) ||
					!Character.isDigit(ssn.charAt(1)) ||
					!Character.isDigit(ssn.charAt(2)) ||
					!Character.isDigit(ssn.charAt(4)) ||
					!Character.isDigit(ssn.charAt(5)) ||
					!Character.isDigit(ssn.charAt(7)) ||
					!Character.isDigit(ssn.charAt(8)) ||
					!Character.isDigit(ssn.charAt(9)) ||
					!Character.isDigit(ssn.charAt(10)) )
			{
				System.out.printf("%s is an invalid Social Security Number", ssn);
			}
			else
			{
				System.out.printf("%s is a valid Social Security Number", ssn);
			}
		}
		else
		{
			System.out.printf("%s is an invalid Social Security Number", ssn);
		}
		

	}

}
