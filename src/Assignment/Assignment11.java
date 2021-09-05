package Assignment;

public class Assignment11 {
	int i;
	static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment11 as = new Assignment11();
		as.non_static();
		as.meth_static2();
		as.i=100;
		j=200;
		as.j=400;
	}

	
	public void non_static(){
		System.out.println("pass1");
		}
	
	public static void meth_static2(){
		System.out.println("pass1");
		}
}
