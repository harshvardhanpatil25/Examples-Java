package Examples;

import java.util.Scanner;

public class FindOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
	
		if(number%2==0)
		{
			System.out.println("NUMBER IS EVEN");
		}
		else
		{
			System.out.println("NUMBER IS ODD");
			
		}
			
		
	}

}
