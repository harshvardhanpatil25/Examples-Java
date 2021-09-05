package Tricky_Naveen;

import java.util.stream.IntStream;

public class Print1to100WithouUsingLoop {
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
	IntStream.range(1, 101).forEach(e ->System.out.println(e));
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
