package Example100;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		float b;
		String s;
		
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter integer");
				a=sc.nextInt();
				System.out.println(a);
				System.out.println("Enter float value");
				b =sc.nextFloat();
				System.out.println(b);
				System.out.println("Enter string value");
				s=sc.nextLine();
				System.out.println(s);
				
		
		sc.close();
		
	}

}
