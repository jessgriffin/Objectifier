
public abstract class Vehicle {

	public String _licensePlate;
	public String _colour;
	public int _numberOfDoors;
	public int _speed = 0;
	public int _maximumSpeed;
	
	//constructor
	public Vehicle (String licensePlate, String colour, int numberOfDoors){
		
		this._licensePlate = licensePlate;
		this._colour = colour;
		this._numberOfDoors = numberOfDoors;
		this._speed = 0;
		this._maximumSpeed = 250;
		
	}
	
	//getter
	public String getLicensePlate() { return this._licensePlate; }
	public String getColour() { return this._colour; }
	public int getNumberOfDoors() {return this._numberOfDoors; }
	public int getSpeed() { return this._speed; }
	public int getMaximumSpeed() { return this._maximumSpeed; }
	
	//setter
	public void setLicensePlate(String licensePlate) { this._licensePlate = licensePlate; }
	public void setColour(String colour) { this._colour = colour; }
	public void setNumberOfDoors(int numberOfDoors) { this._numberOfDoors = numberOfDoors; }
	
	protected void Accelerate (int accelerateAmount) {
		
		this._speed = this._speed + accelerateAmount;
		
	}
	
	protected void Brake (int pressure, int time) {
		
		//this formula is absolute bs and makes no sense it's probably calculus
		this._speed = this._speed / (pressure * time);
		
	}
}
