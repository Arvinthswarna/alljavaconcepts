
public class Test3 {
	//function with parameters
	static void addition(int num1,int num2) {
		int res;
		res = num1 + num2;
		System.out.println("Sum of two numers are: " + res);
		
	}
	static void sub(int num1,int num2) {
		int res;
		res = num1 - num2;
		System.out.println("Subtraction of two numbers are: " + res);
	}
	
	static void mul(int num1,int num2) {
		int res;
		res = num1 * num2;
		System.out.println("product of two numers are: " + res);
	}
	
	static void div(int num1,int num2) {
		int res;
		res = num1 / num2;
		System.out.println("division of two numers are: " + res);
	}
public static void main(String[] args) {
	
	addition(50,50);// calling function by passing values
	addition(40,40);
	sub(50,50);
	mul(50,50);
	div(100,50);
	div(300,6);
	div(100000,5);
	
}
}
