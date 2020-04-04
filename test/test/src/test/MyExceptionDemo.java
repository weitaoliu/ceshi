/**
 * 
 */
package test;

/**
 * @author Ð«×ÓÀ³À³
 *
 */
public class MyExceptionDemo extends Exception {

	/**
	 * @param args
	 * @throws MyExceptionDemo 
	 */
	
	public void method () throws MyException {
		throw new MyException("µÎµÎ´ð´ð");
	}
	
	public static void main(String[] args) {
		try {
			new MyExceptionDemo().method();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

class MyException extends Exception {

	public MyException(String string) {
		super(string);
	}

	
}
