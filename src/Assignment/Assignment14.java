package Assignment;

public class Assignment14 {

	int var;
	static int stc=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment14 ob1 = new Assignment14();
		ob1.var=9;
		System.out.println("var of ob1 "+ob1.var);

		Assignment14 ob2 = new Assignment14();
		ob2.var=90;
		System.out.println("var of ob2 "+ob2.var);

		ob1.stc=ob1.stc+100;

		System.out.println("ob1 "+ob1.stc);

		System.out.println("ob2 "+ob2.stc);
	}

}
