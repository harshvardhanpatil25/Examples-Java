package Tricky_Naveen;


/**
 * @author Harsh
 *Interview Question: What is NaN - Not A Number? How is NaN defined in different languages?
 *Number is not defined(undefined numbers) then NaN is getting in output
 *Nan Not an Number
 */
public class What_is_NaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(2/0);

System.out.println(2.0/0.0);


System.out.println(0.0/0.0);

System.out.println(Math.sqrt(-1));

System.out.println(Float.NaN==Float.NaN);

System.out.println(Float.NaN !=Float.NaN);
	}

}
