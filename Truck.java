//still need to make changes to the stub program to accept the new parameter of liftheight when creating a  truck (and printing it)
public class Truck extends Vehicle {
	
	public int _numberOfTires;
	public int _liftHeight;
	public int _numberOfCylinders;
	
	//constructor
	public Truck(String licensePlate, String colour, int numberOfDoors, int numberOfTires,int liftHeight, int numberOfCylinders) {
		super(licensePlate, colour, numberOfDoors);
		
		this._numberOfTires = numberOfTires;
		this._liftHeight = liftHeight;
		this._numberOfCylinders = numberOfCylinders;
		
	}
	
	//getter
	public int getTires() { return this._numberOfTires; }
	public int getLiftHeight() { return this._liftHeight; }
	public int getNumberOfCylinders() { return this._numberOfCylinders;}
	
	//setter
	public void setLiftHeight(int liftHeight) {this._liftHeight = liftHeight;} 
}
