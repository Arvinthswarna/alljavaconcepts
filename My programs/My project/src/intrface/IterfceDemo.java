package intrface;
interface ww {
	void show();
	void display();
}

public class IterfceDemo implements ww { 
	
	public void show() {
		System.out.println("msg from show()");
	}
public void display() {
	System.out.println("msg from display()");
}
public static void main(String[] args) {
	
	IterfceDemo obj = new IterfceDemo();
    obj.show();
    obj.display();
    }
}