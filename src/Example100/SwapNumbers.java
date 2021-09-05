package Example100;

import java.util.Scanner;

public class SwapNumbers {

	
	//How to swap 2 no using 3rd variable Program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,temp;
		
		System.out.println("Enter a and b ");
		Scanner sc = new Scanner(System.in);
			a =sc.nextInt();
			b=sc.nextInt();
			
			System.out.println("Before swapping a:"+a+"b is:"+b);
		
			temp =a;
			a=b;
			b=temp;
			System.out.println("After swapping a:"+a+"b is:"+b);
		sc.close();
	}

}
