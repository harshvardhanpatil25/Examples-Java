package Assignment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;//Not used
		f1(1);// passing value to method f1(1)=1

		}

		public static void f1(int i)
		{
		f2(i+1); //f2(1+1)==f2(2)
		}

		public static void f2(int i)
		{
		f3(i+2); //f3(2+2)==f3(4)
		}

		public static void f3(int i)
		{
		System.out.println(i+3); //f3(4+3)==f3(7)//output is 7
		
	}

}
