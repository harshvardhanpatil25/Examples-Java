package RahulShetty;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prime number 11%2 =1 3%2=1 
		boolean flag= false;
		
		int val =11;
		
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)//true not prime number
			System.out.println("it is not prime number");
		else
			System.out.println("it is prime number");
		
	}

}
