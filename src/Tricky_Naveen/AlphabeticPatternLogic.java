package Tricky_Naveen;

/*
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 

*/
public class AlphabeticPatternLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha= 65;//-capital A
		//97 for small case
		for(int i=0; i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			
			System.out.println();
		}

	}

}
