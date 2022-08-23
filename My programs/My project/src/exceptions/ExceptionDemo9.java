package exceptions;

public class ExceptionDemo9 {
	static void validate(int value, String name) throws ArithmeticException{
		if(value == 0) {
			throw new ArithmeticException("my exception thrown");
		}
		
		if(name.equals(null)) {
			throw new NullPointerException("name is empty");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		int res;
		String name = null;
        try {
        	validate(num2,name);
        	res = num1/num2;
        	System.out.println(res);
        }
        catch(ArithmeticException ex) {
        	System.out.println(ex);
        }catch(NullPointerException ex) {
        	System.out.println(ex);
        }
        System.out.println(2);
	}

}
