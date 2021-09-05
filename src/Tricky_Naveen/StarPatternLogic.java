package Tricky_Naveen;

public class StarPatternLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");//this id for space
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");//for star both loop depands on i value
			}
			System.out.println();
			
		}
	}

}
