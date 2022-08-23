package polymorphism;
class RBI{
	void rateofinterest() {
		System.out.println("Rate of Interest is 7%");
	}
}
class SBI extends RBI{
	void rateofinterest() {
		System.out.println("Rate of interest is 8%");
		}
}
class HDFC extends RBI{
	void rateofinterest() {
		System.out.println("Rate of Interest is 10%");
	}
}
class ICICI extends RBI{
	void rateofinterest() {
		System.out.println("Rate of Interest is 12%");
	}
}
public class OverrideDemo1 {
	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.rateofinterest();
	}}
