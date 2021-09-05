package Tricky_Naveen;

/*What is thre value of double  MIN_VALUE?
 * Which one is bigger --> Double MIN_VALUE or 0.0d ?
 * which one is bigger -->Double MIN_VALUE OR NEGATIVE_INFINITY?
 * 
 * 
 * 
 * 
 */
public class What_is_MIN_Value_of_Double_and_Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Double.MIN_VALUE);///+ve number
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		System.out.println(Math.min(Double.MIN_VALUE,0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		
		
		System.out.println(Float.MIN_VALUE);//+ve number
		
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
	}

}
