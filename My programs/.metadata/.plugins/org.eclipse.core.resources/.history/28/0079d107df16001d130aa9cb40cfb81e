package inheritance;
//Parent class
class Vehicle{
	int speed = 100;
	Vehicle(){
		System.out.println("Vehicle Constructor");
	}
	void running() {
		System.out.println("Vehicle running at : " + speed + "/hr");
		
	}
}
//Child Class
class Bike extends Vehicle{
	Bike(){
		super();//parent class constructor
		System.out.println(super.speed);//parent class variable
		super.running();// i am accessing parent class method
	}
}

public class InheritDemo4 {
	public static void main(String[] args) {
		
		new Bike();
	}

}
