package Assignment;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		while(true){
		x = increment(x);//return value is copy into x and print

		System.out.println("Value of x is --"+x);

		if(x>10)
		break;

		}
		}

		public static int increment(int i){
		return i+1;//0+1
		
		
	}

}
