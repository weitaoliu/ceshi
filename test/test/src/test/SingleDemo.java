/**
 * 
 */
package test;

/**
 * @author 蝎子莱莱
 *	 单例模式
 *
 */
class SingleDemo {

	/**
	 * @param args
	 */
	
	public static void main(String args[]) {

		System.out.println(args.length);
	}

}

class Single {
	static Single obj = new Single();
	private Single() {
		
	}
	
	public static Single getInstance () {
		return obj;
	}
}
