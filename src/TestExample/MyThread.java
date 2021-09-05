package TestExample;

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t = new MyThread();
		t.start();
		System.out.println("one...");
		t.start();
		System.out.println("two...");
		
		
		
	}

}
