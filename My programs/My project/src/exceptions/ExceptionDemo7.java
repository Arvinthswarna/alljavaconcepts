package exceptions;

public class ExceptionDemo7 {
 static void calculate() {
	 try {
		 throw new NullPointerException();
	 }catch(Exception ex) {
		 System.out.println("Exception handled ");
		 throw ex;
		 
	 }
 }
 public static void main(String[] args) {
	try {
		calculate();
	}catch(Exception ex) {
		System.out.println("Exception handled in main");
	}
}
}
