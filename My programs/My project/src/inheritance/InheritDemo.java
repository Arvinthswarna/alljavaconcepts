package inheritance;

class Parent {
	int number = 20;
	
}
class Child extends Parent{
	int result;
	
	void add() {
		result = number + 10;
		System.out.println("Result is : " + result);
	}
}

public class InheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child obj = new Child();
       obj.add();
	}

}
