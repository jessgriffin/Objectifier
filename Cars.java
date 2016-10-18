
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
		
		int seatHeight;
		int numberOfSpokes;
		
		int liftHeight;
		
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
			    
			    System.out.println("Enter a number of spokes for vehicle # " + (counter + 1) + ".");
			    numberOfSpokes = Integer.parseInt(br.readLine());
			    
			    System.out.println("Enter a seat height for vehicle # " + (counter + 1) + ".");
			    seatHeight = Integer.parseInt(br.readLine());
			    
			    Bike currentBike = new Bike(colour, numberOfTires, numberOfSpokes, seatHeight);

			    System.out.println("You just created an instance of class 'Bike' with: ");
			    System.out.println("Colour " + currentBike.getColour() + ", and " + currentBike.getTires() + " tires, and " + currentBike.getSpokes() + " spokes, and a seat height of " + currentBike.getSeatHeight());
			    
		    } else if (userChoice.equals("T")) {
		    	
		    	System.out.println("Enter a license plate for vehicle # " + (counter + 1) + ".");
			    licensePlate = br.readLine();
			    
			    System.out.println("Enter a colour for vehicel # " + (counter + 1) + ".");
			    colour = br.readLine();
			    
			    System.out.println("Enter a number of doors for vehicel # " + (counter + 1) + ".");
			    numberOfDoors = Integer.parseInt(br.readLine());
			    
			    System.out.println("Enter a number of tires for vehicle # " + (counter + 1) + ".");
			    numberOfTires = Integer.parseInt(br.readLine());
			    
			    System.out.println("Enter a lift height for vehicle # " + (counter + 1) + ".");
			    liftHeight = Integer.parseInt(br.readLine());
		    	
			    Truck currentTruck = new Truck (licensePlate, colour, numberOfDoors, numberOfTires, liftHeight, 8); //8 cylinders automatically cause trucks are awesome
			    
			    System.out.println("You just created an instance of class 'Truck' with: ");
			    System.out.println("Colour " + currentTruck.getColour() + ", Licesnse Plate " + currentTruck.getLicensePlate() + ", " + currentTruck.getNumberOfDoors() + " doors, and " + currentTruck.getTires() + " tires, and " + currentTruck.getLiftHeight() + "cm lift height with 8 cylinders");
			    
		    } else if (userChoice.equals("V")) {
		    	//mr coxall wanted us to make this error to show that we can't instantiate an abstract
		    	Vehicle vehicle = new Vehicle();
		    	//i have ants in my pants
		    }
		    
		    else {
		    	
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
