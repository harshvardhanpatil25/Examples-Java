package Assignment;

public class Assignment28 {
	
	int i=1;
	static int a=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment28 t= new Assignment28();
		calArea(); //1
		nonstaticMethod(); //2

		Assignment28.calArea(); //3
		t.calArea(); //4

		i=i+1; //5
		a=a+1; //6

		static int b=1; //7
		
	}

	
	public void nonstaticMethod(){

	}

	public static int calArea(){

	return 1*1;

	}
}
