package Examples;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstnumber = scanner.nextInt();
		System.out.println("Enter second Number");
		int secondnumber = scanner.nextInt();
		scanner.close();
		System.out.println("Sum of"+firstnumber+" and "+secondnumber+" is "+(firstnumber+secondnumber));
		
	}

}
