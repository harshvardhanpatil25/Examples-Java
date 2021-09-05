package Examples;

import java.util.Scanner;

public class Given_Year_is_LEAP_Year_Or_NOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
int year = scanner.nextInt();
scanner.close();
if(year%400==0)
{
	System.out.println(year+" is a leap year");
}
else if(year%100==0)
{
	System.out.println(year+" is not a leap year");
}	
else if(year%4==0)
{
	System.out.println(year+" is a leap year");
}
else
{
	System.out.println(year+" is  not a leap year");
}
	}

	}
