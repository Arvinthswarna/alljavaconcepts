package exceptions;

public class ExceptionDemo8 {
	static void calculation() throws ArithmeticException {
		throw new ArithmeticException("welcome sriraksha");
	}
	public static void main(String[] args) {
		System.out.println(1);
		try {
		calculation();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(3);

	}

}
