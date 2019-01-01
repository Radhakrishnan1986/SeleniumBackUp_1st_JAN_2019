package threadTest;

public class ThreadTest extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();

		t1.start();
		t2.start();
		//Thread.sleep(5000);
		//t1.start();
	}
}
