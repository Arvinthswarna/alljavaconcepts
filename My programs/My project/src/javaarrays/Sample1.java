package javaarrays;

public class Sample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10,20,30,40,50};
		               // 0  1  2  3  4
		System.out.println(numbers[3]);
		System.out.println(numbers[2]);
		System.out.println(numbers.length);
		System.out.println("=====================");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println(numbers[5]);
		// Array index out of bound exception
		
	}

}
