package polymorphism;

class Vehicle{
	void running() {
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle{
	void running() {
		System.out.println("Bike is running");
	}
}
public class OverrideDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        Bike b1 = new Bike();
		b1.running();
		

	}

}
