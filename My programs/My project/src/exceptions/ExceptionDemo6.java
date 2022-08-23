package exceptions;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 20;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(number/0);
		}catch(NullPointerException ex) {
			System.out.println("Exception handled");
			ex.printStackTrace();
		}finally {
			System.out.println("Welcome to final block");
			//finally means the finally will be executed at any cost before the exception occurs also.
		}
System.out.println(3);
//This will not get executed because the exception had occured and was not cleared

}}
