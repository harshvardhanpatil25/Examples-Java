package RahulShetty;

public class Example1 {
//Create method which accept array and  the sum of element in array:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,50,20,10,10};
		int sum =sumArray(a);
		System.out.println("sum is "+sum);

	}

public static int sumArray(int[] a) {
	
	int sum =0;
	//extract every value of array and sum each value with other
	for(int i=0;i<a.length;i++)
	{
		//System.out.println(a[i]);
		sum = sum+a[i];//
	}
	
	return sum;
}

}
