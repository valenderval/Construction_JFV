
public class Residential extends Building {
	
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		this.numBedrooms=0;
		this.numBathrooms=0;
		this.laundryRoom=true;
	}//end empty-argument constructor

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
			this.numBedrooms=0;
			this.numBathrooms=0;
			this.laundryRoom=true;
			
	}//end preferred constructor

	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method
	
	public String displayData() {
		return toString();
	}//end displayData
	
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	@Override
	public String toString() {
		return "Residential \nProject Name:" + projectName + "\nAddress:" + completeAddress + "\nSquareFeet:"
				+ totalSquareFeet + "\nOccupancy Group:" + occupancyGroup + "\nOccupancy Subgroup:" + subgroup
				+ "\nNumber of Bedrooms:" + numBedrooms + "\nNumber of Bathrooms:" + numBathrooms + "\nLaundry Room:"
				+ laundryRoom;
	}//end toString
	
	
	
}//end class
