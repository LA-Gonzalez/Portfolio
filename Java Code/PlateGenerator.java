
public class PlateGenerator {

	public static void main(String[] args) {
		
		char ch1 = (char)( 65+ Math.random()*(90-65));
		char ch2 = (char)( 65+ Math.random()*(90-65));
		char ch3 = (char)( 65+ Math.random()*(90-65));
		int ch4 = (int)(Math.random()*9);
		int ch5 = (int)(Math.random()*9);
		int ch6 = (int)(Math.random()*9);
		int ch7 = (int)(Math.random()*9);
		
		System.out.printf("Plate Number is: %c%c%c %d%d%d%d",
				ch1,ch2,ch3,ch4,ch5,ch6,ch7);		
	}

}
