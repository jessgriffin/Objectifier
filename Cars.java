//still dont have brake and accelerate working, made by jess and craig 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cars {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String licensePlate;
		String colour;
		int numberOfDoors;
		int speed;
		int maximumSpeed;
		
		
		int accelerateAmount;
		int brakePressure;
		int brakeTime;
		
		boolean moreCars;
		for (int counter = 0; moreCars = true; counter++) {
			
		    InputStreamReader r = new InputStreamReader(System.in);
		    BufferedReader br = new BufferedReader(r);
		    
		    System.out.println("Enter a license plate for car # " + (counter + 1) + ".");
		    licensePlate = br.readLine();
		    
		    System.out.println("Enter a colour for car # " + (counter + 1) + ".");
		    colour = br.readLine();
		    
		    System.out.println("Enter a number of doors for car # " + (counter + 1) + ".");
		    numberOfDoors = Integer.parseInt(br.readLine());
		    
		    //System.out.println("Enter a middle initial for student # " + (counter + 1) + ".");
		   // maximumSpeed = br.readLine();
		    
		    System.out.println("Do you want to make another vehicle? Y/N");
		    
		    if (br.readLine()== "N") {
		    	
		    	moreCars = false;
		    	
		    }
		    
		    Vehicle currentVehicle = new Vehicle(licensePlate, colour, numberOfDoors );
		    
		    //currentStudent.setFirstName(firstName);		    
		    
		}
		
		
		
	}

}
