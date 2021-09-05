package Tricky_Naveen;

public class AlphabeticPatternLogic_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A-Z 65 TO 90
		//a-z 97 To 122
		int alpha =65;
		for(int i=0;i<=5;i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print((char)(alpha)+" ");
				
			}
			alpha++;
			System.out.println();
			
		}
			
	}

}
