package Assignment;

public class Assignment27 {
	int i=1;
	static int a=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void nonstaticMethod(){
		calArea(); // 1
		nonstaticMethod(); //2

		Assignment27.calArea(); // 3
		Assignment27 t = new Assignment27();
		t.calArea(); // 4

		i=i+1; // 5
		a=a+1; // 6

		static int b=1; // 7
}
	
	public static int calArea(){

		return 8*8;
		}
}
