//still dont have brake and accelerate working, made by jess and craig 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cars {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String licensePlate = null;
		String colour = null;
		int numberOfDoors = 0;
		int speed = 0;
		int maximumSpeed = 0;
		int numberOfTires = 0;
		
		
		int accelerateAmount;
		int brakePressure;
		int brakeTime;
		
		boolean moreCars;
		for (int counter = 0; moreCars = true; counter++) {
			
		    InputStreamReader r = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(r);
		    
		    System.out.println("Creating new vehicle...");
		    System.out.println("Bike or Truck? write B or T");
		    
		    String userChoice = br.readLine();
		    userChoice = userChoice.toUpperCase();
		    
		    if (userChoice.equals("B")) {
		    	
		    	System.out.println("Enter a colour for vehicle # " + (counter + 1) + ".");
			    colour = br.readLine();
			    
			    System.out.println("Enter a number of tires for vehicle # " + (counter + 1) + ".");
			    numberOfTires = Integer.parseInt(br.readLine());
		    	//havent addded new parameters to pass in yet number of spokes and seatheight
			    Bike currentBike = new Bike(colour, numberOfTires);

			    System.out.println("You just created an instance of class 'Bike' with: ");
			    System.out.println("Colour " + currentBike.getColour() + ", and " + currentBike.getTires() + " tires." );
			    
		    } else if (userChoice.equals("T")) {
		    	
		    	System.out.println("Enter a license plate for vehicle # " + (counter + 1) + ".");
			    licensePlate = br.readLine();
			    
			    System.out.println("Enter a colour for vehicel # " + (counter + 1) + ".");
			    colour = br.readLine();
			    
			    System.out.println("Enter a number of doors for vehicel # " + (counter + 1) + ".");
			    numberOfDoors = Integer.parseInt(br.readLine());
			    
			    System.out.println("Enter a number of tires for vehicle # " + (counter + 1) + ".");
			    numberOfTires = Integer.parseInt(br.readLine());
		    	//this doesnt work because havent added cylinders and liftheight yet
			    Truck currentTruck = new Truck (licensePlate, colour, numberOfDoors, numberOfTires); 
			    
			    System.out.println("You just created an instance of class 'Truck' with: ");
			    System.out.println("Colour " + currentTruck.getColour() + ", Licesnse Plate " + currentTruck.getLicensePlate() + ", " + currentTruck.getNumberOfDoors() + " doors, and " + currentTruck.getTires() + " tires." );
			    
		    } else {
		    	
		    	System.out.println("Please enter a valid input: either 'B' or 'T'.");
		    	
		    }
		    

		    
		    //System.out.println("Enter a middle initial for student # " + (counter + 1) + ".");
		   // maximumSpeed = br.readLine();
		    
		    System.out.println("Do you want to make another vehicle? Y/N");
		    
		    userChoice = br.readLine().toUpperCase();
		    
		    if (userChoice.equals("N") || userChoice.equals("NO")) {
		    	
		    	moreCars = false;
		    	
		    }
		    
		    
		    //currentStudent.setFirstName(firstName);		    
		    
		}
		
		//once user says no more vehicles, the program goes here:
		
		
	}

}
