package Assignment;

public class Assignment2 {

	public static void main(String[] args) {
		int i=2;//this value is not used in program
		f1(1);//pass 1 value in f1
		}
		public static void f1(int i)//here i=1
		{
		f2(i+1);//(1+1)=2
		}
		public static void f2(int i)//here i=2
		{
		f3(i+2);//2+2=4
		}
		public static void f3(int i)//here i=4
		{
		System.out.println(i+3);//4+3=7
	}
	
}
