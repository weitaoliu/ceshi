/**
 * 
 */
package test;

/**
 * @author Ğ«×ÓÀ³À³
 *
 */
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {-53, -9, -5, -152, -35, -52,99,46,87};
		/*×îÖµ*/
//		for(int i = 0; i < a.length-1; i++) {
//			if(a[i]>a[i+1]) {
//				int temp = a[i];
//				a[i] = a[i+1];
//				a[i+1] = temp;
//			}
//		}
//		System.out.println(a[a.length-1]);

		sort(a);
//		int length = a.length;
//		while(length>1) {
//			a = sort(a, length-1);
//			length--;
//		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

	/*Ã°ÅİÅÅĞò*/
	public static int[] sort(int[] arr, int length) {
		for(int i=0; i<length; i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	/*Ñ¡ÔñÅÅĞò*/
	public static int[] sort(int[] a) {
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	

}
