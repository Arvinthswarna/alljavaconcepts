package exceptions;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50};
		               // 0  1  2  3  4     index number of array
	System.out.println(numbers[2]);	
	try {
		System.out.println(numbers[3]);
		System.out.println(numbers[5]);
	}catch (Exception ex) {
		//ex.printStackTrace();
		//print the details of exception what the error is
		//Array index out of bound exception
		System.out.println("exception ocuured" + ex);
	}
	System.out.println(numbers[4]);
	
	
	}
}
