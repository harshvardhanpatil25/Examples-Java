package RahulShetty;

public class Example2 {
//Print 5 multiplication table without using Multiply operator/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int result =multiply(5,10);
 System.out.println(result);
 
	}

public static int multiply(int i, int j) {
	// approach 
	int k=1;
	int sum=0;
	while(k<=j)
	{
		k++;
		sum=sum+i;//5 ,5+5=10,10+5
	}
	return sum;
}

}
