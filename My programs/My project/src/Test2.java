
public class Test2 {
	static void addition() {
		int num1 =50;
		int num2 =25;
		int res;
		res = num1 + num2;
		System.out.println("Sum of two numers are: " + res);
		
	}
	
	static void sub() {
		int num1 =50;
		int num2 =25;
		int res;
		res = num1 - num2;
		System.out.println("Subtraction of two numers are: " + res);
	}
	
	static void mul() {
		int num1 =50;
		int num2 =25;
		int res;
		res = num1 * num2;
		System.out.println("product of two numers are: " + res);
	}
	static void div() {
		int num1 =50;//variable
		int num2 =25;//variable
		int res;
		res = num1 / num2;
		System.out.println("division of two numers are: " + res);
	}
	
	public static void main(String[] args) {
		
		addition();//calling function
		sub();
		mul();
		div();
	}

}
