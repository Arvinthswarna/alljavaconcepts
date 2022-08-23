package javathreads;

public class Test3 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
				//500 is milli second that means half second.In the output it will appear after every half second
				}catch(InterruptedException ex) {
					System.out.println(ex);
				}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test3 obj1 = new Test3();
    obj1.start();
    try {
    obj1.join();//permits one thread to wait untill the other thread to finish its execution.If we remove this obj.join threads will appear simultaneously.
    }catch(InterruptedException e) {
    	e.printStackTrace();
    }
    Test3 obj2 = new Test3();
    obj2.start();

	}

}
