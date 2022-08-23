package exceptions;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		int number = 20;
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(number/0);//exception occured and go to catch block
			System.out.println(3);//This will not execute because the exceptio occured in above line
		}catch(Exception ex) {
			System.out.println(4);
			System.out.println("exception handled");
		}
		System.out.println(5);
	}

}
