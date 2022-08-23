package polymorphism;
class Calculation1{
	
	void addition(int x,int y) {
		int res;
		res = x + y;
		System.out.println("sum of numbers are : " + res );
	}
	void addition(float x,float y) {
		float res;
		res = x + y;
		System.out.println("sum of numbers are : " + res);
		
		
	}
}

public class OverLoading1 {
	
	public static void main(String[] args) {
		Calculation1 sri = new Calculation1();
		sri.addition(20,20);
		sri.addition(40.5f,40.8f);
	//for float datatype we have to specify f otherwise we can use double,long datatype
	}
}
