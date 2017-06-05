
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Ferrari", "yellow"), car2 = new Car("Jetta"), car3 = new Car();

		
/*		
		car1.setColor("red");
		car1.setBrand("Porsche");
		car1.setStatus("is parked at dealership.");
		
		car2.setColor("blue");
		car2.setBrand("Jetta");
		car2.setStatus("is parked at dealership.");
*/
		car1.start();
		car1.accelerate();
		car2.start();
		car1.setSpeed(120);
		car3.start();
		car2.setSpeed(74);
		car2.stop();
		car3.accelerate();
		car1.stop();
		
		
		
	}

}
