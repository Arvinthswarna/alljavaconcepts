package polymorphism;

//Function OverLoading
class Calculation{
	int res;
	void addition(int x,int y) {
		res = x + y;
		System.out.println("Sum of numbers are: " + res);
	}
	void addition(int x,int y,int z) {
		res = x + y + z;
		System.out.println("Sum of numbers are : " + res);
	}
}

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculation obj = new Calculation();
        obj.addition(10, 20, 30 );
        obj.addition(40,40);
	}

}
