package test;

public class Test extends Thread{
	
	public void finalize () {
		System.out.println("Çå³ý³É¹¦");
	}

	public void run () {
		for (int i = 0; i<10; i++) {
			System.out.println("i========" + i + "......name====" + Thread.currentThread().getName());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test();
		Test b = new Test();
		a.start();
		b.start();
		System.out.println("Hello" + "------" + Thread.currentThread().getName());
	}
}