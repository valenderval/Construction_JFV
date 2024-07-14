
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		this.numRentedUnits=0;
		this.medianUnitSize=0.0;
		this.numParkingSpaces=0;
	}//end empty-argument constructor

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentedUnits=0;
		this.medianUnitSize=0.0;
		this.numParkingSpaces=0;
	}//end preferred constructor

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setmedianUnitSize

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	@Override
	public String toString() {
		return "Mall \nProject Name:" + projectName
				+ "\nAddress:" + completeAddress + "\nSquare Feet:" + totalSquareFeet + "\nOccupancy Group:"
				+ occupancyGroup + "\nOccupancy Subgroup:" + subgroup + "\nRented Units:" + numRentedUnits + "\nMedian Unit Size:" + medianUnitSize + "\nParking Spaces:"
				+ numParkingSpaces + "\nRentable Units:" + numRentableUnits;
	}

	
}//end class
