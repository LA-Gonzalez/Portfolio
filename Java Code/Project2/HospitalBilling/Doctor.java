
public class Doctor extends Person{

	protected String specialty;
	
	Doctor(){
		super();
	}
	Doctor(String first, String last,String specialty){
		super(first,last);
		this.specialty = specialty;
	}
	
	public void setSpecialty(String specialty){
		this.specialty=specialty;
	}
	
	public String getSpecialty(){
		return this.specialty;
	}
	
	@Override
	public String getName() {
		return super.getName() + " " + this.specialty;
	}
	
}
