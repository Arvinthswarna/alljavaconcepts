package exceptions;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("welcome");
		try {
			String name = null;
			System.out.println(name.length());
		}catch(Exception ex) {
		System.out.println("exception handled");
		}
		System.out.println("Thank you");
	}

}
