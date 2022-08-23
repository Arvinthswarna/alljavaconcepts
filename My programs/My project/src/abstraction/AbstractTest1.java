package abstraction;
 abstract class Bike{
	 abstract void running();//function without definition or body or implementation
	 void display() {
		 System.out.println("display() from Bike Class");
	 }
}
public class AbstractTest1 extends Bike {
	@Override
	void running() {
		System.out.println("msg from Sriraksha");
	}
	public static void main(String[] args) {
		AbstractTest1 obj = new AbstractTest1();
				obj.running();
				obj.display();
	}

	
	
		
	}

