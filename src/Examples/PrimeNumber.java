package Examples;

public class PrimeNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int flag=0;
		int n=21;
		int fun;
		fun=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime number");
		}
		else
		{
			for(i=2;i<=fun;i++)
			{
				if(n%i==0) {
					System.out.println(n+"is notprime number");
					flag=1;
				           }
				if(flag==0) {System.out.println(n+"is prime number");}	
			}
		}
		
	}

}
