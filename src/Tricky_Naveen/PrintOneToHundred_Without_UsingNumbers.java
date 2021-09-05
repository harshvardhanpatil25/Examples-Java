package Tricky_Naveen;

public class PrintOneToHundred_Without_UsingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one ='A'/'A';  //1
		
		String s1 ="..........";//10 dots
		for(int i=one;i<=(s1.length()*s1.length()); i++)//WAY-1
		{
			System.out.println(i);
		}
		System.out.println("======================================");
		
		
		
		//a-97,b-98,c-99,d-100 
		for(int i=one;i<='d'; i++)//WAY-2
		{
			System.out.println(i);
		}
		
	}

}
