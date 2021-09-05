
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] a= {1};
	Test y = new Test();
	y.increment(a);
	System.out.println(a[a.length -1]);
}
	void increment(int[] i)
	{
		i[i.length-1]++;
	}
	
	
}