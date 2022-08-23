package exceptions;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 30;
		String name = null;
		System.out.println(1);
try {
	System.out.println(name.length());
	System.out.println(number/0);
	//Exception occured in first sop and straightly goes to catch block without executing.In try block if the exception occurs it stops abruptly
}catch(ArithmeticException ex) {
	ex.printStackTrace();
	//Arithmetic exception will not execute
}
catch(NullPointerException ex) {
	ex.printStackTrace();
	//directly comes to null pointer exception
}
System.out.println(3);
	}

}
