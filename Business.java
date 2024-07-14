
public class Business extends Building{
	protected int numRentableUnits;
	
	public Business() {
		this.numRentableUnits=0;
	}// end empty-argument constructor

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=0;
		
	}//end preferred constructor

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
	
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits
	
	@Override
	public String toString() {
		return "Business \nProject Name:" + projectName + "\nAddress:"
				+ completeAddress + "\nSquare Feet=" + totalSquareFeet + "\nOccupancy Group:" + occupancyGroup
				+ "\nOccupancy Subgroup:" + subgroup + "\nRentable Units:" + numRentableUnits;
	}//end toString
	
}//end class
