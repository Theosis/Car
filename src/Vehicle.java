
public class Vehicle {
	
	public String color;
	public String brand;
	
	public String start() {
		return "The " + color + " " + brand + " is starting"; 
	}
	
	public String accelerate() {
		return "The " + color + " " + brand + " is accelerating";
	}
	
	public String setSpeed(int speed) {
		return "The " + color + " " + brand + " is going " + speed + " mph"; 
	}
	
	public String stop() {
		return "The " + color + " " + brand + " is stopped"; 
	}
	
}
