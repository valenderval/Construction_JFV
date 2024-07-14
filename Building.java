
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
		this.projectName="";
		this.completeAddress="";
		this.totalSquareFeet=0.0;
		this.occupancyGroup="";
		this.subgroup="";
	}//end empty-argument constructor
	
	public Building(String projectName, String completeAddress, double
			totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.totalSquareFeet=totalSquareFeet;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
	}//end preferred constructor
	
	public void Draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}// end Draw method
	
	public String displayData() {
		
		return toString();
	}//end displayData

	public String getProjectName() {
		return projectName;
	}//end getProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquarefeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup

	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup

	@Override
	public String toString() {
		return "Building \nProject Name:" + projectName + "\nAddress:" + completeAddress + "\nSquare Feet:"
				+ totalSquareFeet + "\nOccupancy Group:" + occupancyGroup + "\nOccupancy Subgroup:" + subgroup;
	}//end  toString
	
	
	
}//end class
