package Tricky_Naveen;

public class Print1to100WithouUsingLoop2 {
	/**
	 * 
	 * print  1 to 100
	 * 1.recursive function
	 * 2.Java streams
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNum(1);
		printNumber(1,100);
	}
		
		public static void printNum(int num)
		{
			if(num <=100)
			{
				System.out.println(num);
				num++;
				printNum(num);
			}			
	}
		
public static void printNumber(int stNum , int endNum){
			
			if(stNum <= endNum)
			{
				System.out.println(stNum);
				stNum++;
				printNumber(stNum,endNum);
			}
			
		}

}
