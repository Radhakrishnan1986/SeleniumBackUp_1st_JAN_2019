package loopingTest;

public class WhileTest {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
// TODO Auto-generated method stub
		while (i <= 5) {
			Thread.sleep(2000);
			System.out.println(i);
			i++;
		}

	}

}