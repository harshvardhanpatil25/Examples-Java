package RahulShetty;

public class PrimeNumberfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primenumber(11);
	}

	public static void primenumber(int val) {
		// TODO Auto-generated method stub
		boolean flag =false;
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			{
				flag = true;
				break;
			}	
		}
		if(flag)//true not prime number
			System.out.println("it is not prime number");
		else
			System.out.println("it is prime number");
		
	}

}
