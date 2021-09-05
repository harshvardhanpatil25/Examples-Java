package Tricky_Naveen;

public class StarTringlePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i= 0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("------------------------- ");	
		
		for(int i= 0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("------------------------- ");	
		
		
		for(int i= 0;i<=10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("8");
			}
			System.out.println(" ");
		}
		
		
		for(int i= 0;i<=10;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
	}

}
