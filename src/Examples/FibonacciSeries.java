package Examples;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In fibonacci series, next number is the sum of previous two numbers for 
		//example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		//The first two numbers of fibonacci series are 0 and 1.
		int Number1=0;
		int Number2=1;
		int Number3;
		int count=10;
		System.out.print(Number1+ " "+Number2);//printing 0 and 1 
		for(int i =0;i<count;i++)//loop starts from 2 because 0 and 1 are already printed   
		{
		Number3=Number1+Number2;
		Number1=Number2;
		Number2=Number3;
	
			System.out.print(" "+Number3);
		}
	 }

}
