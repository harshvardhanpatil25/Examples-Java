package Assignment;

public class Assignment29 {
	int i;
	int j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area = calArea1(3,4);
		System.out.println(area);
		Assignment29 t = new Assignment29();
		area = calArea2(t);
		System.out.println(area);
	}
	
	public static int calArea1(int i, int j) {
		return i*j;
		}

	public static int calArea2(Test t) {
		t.i=t.i+10;
		t.j=t.i+20;
		return t.i*t.j;
		}
}
