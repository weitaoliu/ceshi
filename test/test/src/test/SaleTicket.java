/**
 * 
 */
package test;

/**
 * @author Ğ«×ÓÀ³À³
 *
 */

/**
 ĞèÇó£ºÂôÆ±
 */
public class SaleTicket implements Runnable{

	/**
	 * @param args
	 */
	
	private int num = 100;
	public void sale() {
		while(true) {
			if(num>0) {
				System.out.println(Thread.currentThread().getName() + "-------------sale------------" + num--);
			}
		}
	}
	public void run() {
		sale();
	}
	public static void main(String[] args) {
		SaleTicket t = new SaleTicket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		int x = 3;
		byte y = (byte) x;

	}

}
