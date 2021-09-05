package Assignment;

public class Test7 {

	int i;
	static int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		System.out.println(j);
	}
	public void non_static(){
		System.out.println(i);
		System.out.println(j);
		}
}
/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot make a static reference to the non-static field i

	at Assignment.Test7.main(Test7.java:9)
 * 
 */
*/