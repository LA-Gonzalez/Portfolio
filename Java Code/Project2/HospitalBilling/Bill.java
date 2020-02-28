
public class Bill {
	
	

	protected int patientID;
	protected int age;
	protected int DOB;
	protected double pharmacyCharges;
	protected double doctorFee;
	protected double roomCharges;
	protected double total;
	private Patient patient = new Patient();
	private Doctor physician = new Doctor();
	private Date dateAdmitted = new Date();
	private Date dateDischarged = new  Date();
	
	Bill(){
		
	}
	
	Bill(int patientID, double pharmacyCharges, double roomCharges, double doctorFee,
			Patient patient,Doctor physician, Date dateAdmitted, Date dateDischarged){
		this.patientID = patientID;
		this.pharmacyCharges = pharmacyCharges;
		this.roomCharges = roomCharges;
		this.doctorFee = doctorFee;
		this.patient = patient;
		this.physician = physician;
		this.dateAdmitted = dateAdmitted;
		this.dateDischarged = dateDischarged;
		this.total = this.pharmacyCharges + this.doctorFee + this.roomCharges;
		
	}
	
	
	
	//setPatientID
	public void setPatientID(int id){
		this.patientID = id;
	}	
	//getPatientID
	public int getPatientID(){
		return this.patientID;
	}
	//setPharmacyCharges
	public void setPharmacyCharges(double charge){
		this.pharmacyCharges = charge;
	}
	
	//getPharmacyCharges
	public double getPharmacyCharges(){
		return this.pharmacyCharges;
	}
	//setDoctorFee
	public void setDoctorFee(double charge){
		this.doctorFee = charge;
	}
	//getDoctorFee
	public double getDoctorFee(){
		return this.doctorFee;
	}
	//setRoomCharges
	public void setRoomCharges(double charge){
		this.roomCharges = charge;
	}
	//getRoomCharges
	public double getRoomCharges(){
		return this.roomCharges;
	}
	
	//printBill
	public void printBill() {
		System.out.println("\nPatient: "+this.patient.getName());
		System.out.println("Attending Physician: "+ this.physician.getName());
		System.out.println("Admit Date: "+ this.dateAdmitted.getDate() );
		System.out.println("Discharge Date: "+ this.dateDischarged.getDate());
		System.out.println("");
		System.out.printf("%-20s %1.2f\n","Pharmacy Charges: ", this.pharmacyCharges);
		System.out.printf("%-20s %1.2f\n","Room Charges: ", this.roomCharges);
		System.out.printf("%-20s %1.2f\n","Doctor Fees: ", this.doctorFee);
		System.out.println("-----------------------------------");
		System.out.printf("%-20s %1.2f\n","Total Charges: ", this.total);
	}


}
