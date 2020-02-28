
public class Patient extends Person {
	//variables
	protected int patientID;
	protected int age;
	protected Date DOB;
	protected Doctor physician;
	protected Date dateAdmitted;
	protected Date dateDischarged;
	
	Patient(){
		
	}
	
	Patient(String first,String last, Date dateAdmitted, Date dateDischarged, Doctor physician){
		super(first,last);
		this.dateAdmitted = dateAdmitted;
		this.dateDischarged = dateDischarged;
		this.physician = physician;
	}
	
	//Methods
	public void setPatientID(int id){
		this.patientID = id;
	}
	public int getPatientID(){
		return this.patientID;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setDOB(Date dob){
		this.DOB = dob;
	}
	public Date getDOB(){
		return this.DOB;
	}
	public void setPhysician(Doctor physician){
		this.physician = physician;
	}
	
	public Doctor getPhysician(){
		return this.physician;
	}
	public void setDateAdmitted(Date date){
		this.dateAdmitted = date;
	}
	public Date getDateAdmitted(){
		return this.dateAdmitted;
	}
	public void setDateDischarged(Date date){
		this.dateDischarged = date;
	}
	public Date getDateDischarged(){
		return this.dateDischarged;
	}
	

	
	
}
