
public class Apartment extends Residential{

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		this.numRentableUnits=0;
		this.avgUnitSize=0.0;
		this.parkingAvailable=true;
	}//end empty-argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=0;
		this.avgUnitSize=0.0;
		this.parkingAvailable=true;
	}//end preferred constructor
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData method

	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setparkingAvailable

	@Override
	public String toString() {
		return "Apartment \nProject Name:" + projectName + "\nAddress:" + completeAddress + "\nSquareFeet:"
				+ totalSquareFeet + "\nOccupancy Group:" + occupancyGroup + "\nOccupancy Subgroup:" + subgroup
				+ "\nNumber of Bedrooms:" + numBedrooms + "\nNumber of Bathrooms:" + numBathrooms + "\nLaundry Room:"
				+ laundryRoom + "\nRentable Units:" + numRentableUnits + "\nAverage Unit Size:" + avgUnitSize
				+ "\nParking Available:" + parkingAvailable;
	}//end toString
	
	
}//end class
