package Assignment;

public class Test11 {

	int i;
	static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 t = new Test11();
		t.non_static();
		t.meth_static2();
		meth_static2();
		t.i=100;
		j=200;
		t.j=400;
	}
	
	public void non_static(){
		System.out.println("pass1");
		}

		public static void meth_static2(){
		System.out.println("pass1");
		}
	
}
