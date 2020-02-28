//Program uses and tests polymorphism using interfaces

import java.util.ArrayList;

public class Question2 {

	public interface CarbonFootprint{
		public abstract void getCarbonFootprint();
		
	}
	
	

	//Car Class
	static class Car implements CarbonFootprint{
		
		private String bodyStyle;
		private double fuelSpent;
		
		Car(){
			
		}
		Car(String bodyStyle, double fuelSpent){
			this.bodyStyle = bodyStyle;
			this.fuelSpent = fuelSpent;
		}
		
		
		public String getBodyStyle() {
			return this.bodyStyle;
		}


		public void setBodyStyle(String bodyStyle) {
			this.bodyStyle = bodyStyle;
		}


		public double getFuelSpent() {
			return this.fuelSpent;
		}


		public void setFuelSpent(double fuelSpent) {
			this.fuelSpent = fuelSpent;
		}


		@Override
		public void getCarbonFootprint() {
			System.out.println("Car: yeilds "+(this.fuelSpent)*20+" pounds of CO2");			
		}
	
		
	}//End Car Class
		
	
	//Building Class
	static class Building implements CarbonFootprint{
		
		private double sqFeet;
		
		Building(){
			
		}
		
		Building(double sqFeet){
			this.sqFeet = sqFeet;
		}
		
		public double getSqFeet() {
			return this.sqFeet;
		}


		public void setSqFeet(double sqFeet) {
			this.sqFeet = sqFeet;
		}

		@Override
		public void getCarbonFootprint() {
			System.out.println("Building: yeilds "+((this.sqFeet)*50*20*47*17)+" pounds of CO2");			
		}


				
	}//End Building Class
	
	
	//Bicycle Class
	static class Bicycle implements CarbonFootprint{
		
		private String type;
		
		Bicycle(){
			
		}
		
		Bicycle(String type){
			this.type = type;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public void getCarbonFootprint() {
			System.out.println("Bicycle: 0 pounds of CO2");
			
		}
		
		
	}//end Bicycle Class
	
	
	
	//main method
	public static void main(String[] args) {
		
		ArrayList<CarbonFootprint> arr = new ArrayList<CarbonFootprint>();
		
		Car car = new Car("Sedan", 100);
		Building building = new Building(1000);
		Bicycle bike = new Bicycle("Road Bike");
		
		arr.add(car);
		arr.add(building);
		arr.add(bike);
		
		for(int i = 0; i< arr.size(); i++) {
			arr.get(i).getCarbonFootprint();
		}
				
	}

}

