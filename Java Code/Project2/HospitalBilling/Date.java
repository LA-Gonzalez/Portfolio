
public class Date {
	protected int month;
	protected int day;
	protected int year;
	
	//Constructors
	public Date() {
		
	}
	
	//Methods
	
	public Date(int m, int d, int y) {
		//variables
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	public void setMonth(int m){
		this.month = m;
	}
	
	public void setDay(int d){
		this.day = d;
	}
	
	public void setYear(int y){
		this.year = y;
	}
	
	public String getDate(){
		return this.month+" "+this.day+" "+this.year;
	}
	

}
