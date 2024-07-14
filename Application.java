
public class Application {

	public static void main(String[] args) {
		
		// objects for Building class
		
		Building bA= new Building();
		
		bA.setProjectName("Gaines House");
		
		System.out.println(bA.getProjectName());
		
		bA.setCompleteAddress("123 Main Street, Louisville, Kentucky 40201");
		
		System.out.println(bA.getCompleteAddress());
		
		bA.setTotalSquareFeet(2450.0);
		
		System.out.println(bA.getTotalSquareFeet());
		
		bA.setOccupancyGroup("Residential");
		
		System.out.println(bA.getOccupancyGroup());
		
		bA.setSubgroup("R1");
		
		System.out.println(bA.getSubgroup());
		
		System.out.println(bA.displayData());
		
		System.out.println(bA.toString());
		
				
		Building b1= new Building("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		
		System.out.println(b1.getProjectName());
		
		System.out.println(b1.getCompleteAddress());
		
		System.out.println(b1.getTotalSquareFeet());
		
		System.out.println(b1.getOccupancyGroup());
		
		System.out.println(b1.getSubgroup());
			
		System.out.println(b1.displayData());	
		
		System.out.println(b1.toString());
		
		
		
		//Object for Business class
		
		Business bz = new Business("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		
		bz.setNumRentableUnits(0);
		
		System.out.println(bz.getNumRentableUnits());
		
		System.out.println(bz.displayData());	
			
		System.out.println(bz.toString());
		
		
		
		//Object for Mall class
		
		Mall m = new Mall("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		
		m.setNumRentedUnits(0);
		
		System.out.println(m.getNumRentedUnits());
		
		m.setMedianUnitSize(0);
		
		System.out.println(m.getMedianUnitSize());
		
		m.setNumParkingSpaces(0);
		
		System.out.println(m.getNumParkingSpaces());
		
		System.out.println(m.displayData());
		
		System.out.println(m.toString());
		
		
		
		//Object for Residential class
						
		Residential r =new Residential("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		
		r.setNumBedrooms(0);
	
		System.out.println(r.getNumBedrooms());
		
		r.setNumBathrooms(0);
		
		System.out.println(r.getNumBathrooms());
		
		r.setLaundryRoom(true);
		
		System.out.println(r.isLaundryRoom());
		
		System.out.println(r.displayData());
		
		System.out.println(r.toString());
		
		
		//Object for Apartment Class
		
		Apartment a1 = new Apartment("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		
		a1.setNumRentableUnits(0);
		
		System.out.println(a1.getNumRentableUnits());
		
		a1.setAvgUnitSize(0.0);
		
		System.out.println(a1.getAvgUnitSize());
						
		a1.setParkingAvailable(true);
		
		System.out.println(a1.isParkingAvailable());
		
		System.out.println(a1.displayData());
	
		System.out.println(a1.toString());
		
		
		//Object for SingleFamilyHome class
		
		SingleFamilyHome sfh = new SingleFamilyHome("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R1");
		
		sfh.setGarage(true);
		
		System.out.println(sfh.isGarage());
		
		System.out.println(sfh.displayData());
		
		System.out.println(sfh.toString());
	
	}//end main

}//end class
