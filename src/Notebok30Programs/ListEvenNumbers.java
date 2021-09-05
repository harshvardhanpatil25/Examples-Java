package Notebok30Programs;

public class ListEvenNumbers {

	public static void main(String[] args) {
	
		//define limit
		int limit=50;
		System.out.println("Printing even numbers between 1 and "+limit);
		
		for(int i=1;i<= limit;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
			
		}

	}

}
/*
 Printing even numbers between 1 and 50
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 
 
 */