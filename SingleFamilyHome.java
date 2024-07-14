
public class SingleFamilyHome extends Residential{
	private boolean garage;

	public SingleFamilyHome() {
		super();
		this.garage=true;
	}//end empty-argument constructor

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress,totalSquareFeet, occupancyGroup, subgroup);
		this.garage=true;
	}//end preferred constructor
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData method

	public boolean isGarage() {
		return garage;
	}//end isGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage

	@Override
	public String toString() {
		return "Single Family Home \nProject Name:" + projectName + "\nAddress:" + completeAddress + "\nSquareFeet:"
				+ totalSquareFeet + "\nOccupancy Group:" + occupancyGroup + "\nOccupancy Subgroup:" + subgroup
				+ "\nNumber of Bedrooms:" + numBedrooms + "\nNumber of Bathrooms:" + numBathrooms + "\nLaundry Room:"
				+ laundryRoom +"\nGarage:" + garage; 
	}//end toString
	
}//end class
