/**
 * 
 */
package test;

/**
 * @author Ð«×ÓÀ³À³
 *
 */
public class Abstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1111;
		byte b = (byte)num;
		System.out.println(b);

	}

}

interface a {
	
	public abstract void show1();
	public abstract void show2();
}

class Demo implements a {
	public void show1 () {
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}
}

