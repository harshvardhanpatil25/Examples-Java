package Introduction;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number1 =1.2f;
		float number2 =4.5f;
		System.out.println("BEFORE SWAPPING");
		System.out.println("NUMBER1 :"+number1+"   NUMBER2 :"+number2);
		System.out.println("After SWAPPING");
		
		// Value of first is assigned to temporary
		float temp =number1;
		   // Value of second is assigned to first
		number1=number2;
		
		// Value of temporary (which contains the initial value of first) is assigned to second
        
		number2= temp;
		
		System.out.println("NUMBER1 :"+number1+"   NUMBER2 :"+number2);
		
	}

}
