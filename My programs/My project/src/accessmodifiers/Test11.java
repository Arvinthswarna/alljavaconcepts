package accessmodifiers;

class A{
	private int number = 200;
	// Inside the class only accessible.Private means not accessible outside the class
	 void display() {
		System.out.println("Value is : " + number);
	}
	}


public class Test11 {
	int num = 200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.display();
		System.out.println(obj.num);
// Private modifier cannot accessible outside the class. if i remove line no 19 then output will come.
	}

}
