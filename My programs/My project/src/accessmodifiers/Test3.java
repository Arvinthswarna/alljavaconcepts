package accessmodifiers;

class A3 {
   int number = 200;
	
	 void display() {
		System.out.println("Value is : " + number);
	}
	}


public class Test3 {
	protected int num = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 obj = new A3();
		obj.display();
		System.out.println(obj.number);
	}
	}
