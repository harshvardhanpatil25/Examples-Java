package Examples;

import java.util.Scanner;

public class Multiplication_Table_Given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=1 ;i<=10;i++)
		{
			System.out.println(number+"x"+i+"="+number*i);
		}
		scanner.close();
	}

}
