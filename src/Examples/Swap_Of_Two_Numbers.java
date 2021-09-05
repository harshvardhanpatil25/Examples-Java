package Examples;

import java.util.Scanner;

public class Swap_Of_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int number1 = scanner.nextInt();
System.out.println("FirstNumber is "+number1);
int number2 = scanner.nextInt();
System.out.println("SecondNumber is "+number2);
scanner.close();
int number3;
number3 =number1;
number1=number2;
number2=number3;
System.out.println("After_Swapping_firstNumber "+number1);
System.out.println("After_Swapping_SecondNumber "+number2);
	}

}
