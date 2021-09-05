package Assignment;

public class Assignment20 {
	int i;
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment20 t1 = new Assignment20();
		Assignment20 t2 = new Assignment20();

		t1.j=t2.i=5;
		t1.i=t2.j=6;
		System.out.print(t1.j++ + " " + t2.i--);
	}

}
