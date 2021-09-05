package Example100;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,z;
		
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		
		x= sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		
		if(x>y && x>z)
		{
			System.out.println(x+"is largest");
		}
		else if(y>x &&y>z)
		{
			System.out.println(y+"is largest");
		}
		else if(z>x && z>y)
		{
			System.out.println(z+"is largest");
		}
		else
			System.out.println("entered numbers are equal and same");
		sc.close();
	}

}
