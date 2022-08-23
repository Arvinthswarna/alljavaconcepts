package oops;

class Person{
	String pName = "Sriraksha";
	String pEmail = "Sriraksha@gmail.com";
	String pNumber = "9600441125";
	
	void info() {
		System.out.println(pName + " " + pEmail + " " + pNumber);
	}
}

public class Test1 {
public static void main(String[] args) {
	Person p = new Person();
	p.info();
}	

}
