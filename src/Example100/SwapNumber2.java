package Example100;

import java.util.Scanner;

public class SwapNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How to swap 2 no without using 3rd variable
		int a,b;
		System.out.println("Enter number a and b");
		
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before swapping a:"+a+" b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a:"+a+" b is:"+b);
		
		sc.close();
	}

}
