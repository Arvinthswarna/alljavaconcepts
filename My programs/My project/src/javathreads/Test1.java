package javathreads;

public class Test1 extends Thread {
	public void run() {
		System.out.println("My Thread is running....");
	}
public static void main(String[] args) {
	Test1 obj = new Test1();
	obj.start();
}
}
