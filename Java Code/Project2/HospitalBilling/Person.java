
public class Person {
	//variables
	protected String firstName;
	protected String lastName;
	
	//constructor
	public Person(){
		
	}
	
	public Person(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	
	//methods
	public void setFirstName(String name){
		this.firstName = name;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
		
	public void setLastName(String name){
		this.lastName = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		return this.firstName+" "+this.lastName;
	}

}
