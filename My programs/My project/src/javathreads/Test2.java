package javathreads;


public class Test2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is running !!! ");
		
	}
	public static void main(String[] args) {
      Test2 obj = new Test2();
      Thread tobj = new Thread(obj);
      tobj.start();
	}
	

}
