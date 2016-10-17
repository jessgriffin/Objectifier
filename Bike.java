//still need to add setters for spokes and seat height, and fix the stub program
public class Bike extends Vehicle{
	
	public int _numberOfTires;
	public int _numberOfSpokes; 
	public int _seatHeight;
	
	//constructor
	public Bike(String colour, int numberOfTires, int numberOfSpokes, int seatHeight) {
		super(null, colour, 0);
		
		this._numberOfTires = numberOfTires;
		this._numberOfSpokes = numberOfSpokes;
		this._seatHeight = seatHeight;
		
	}

	//getter
	public int getTires() { return this._numberOfTires; }
	public int getSpokes() { return this._numberOfSpokes; }
	public int getSeatHeight() {return this._seatHeight; }
	
}
