package Assignment;

public class Assignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();

		a.parentMeth();
		a.childMeth();

		b.childMeth();
		a.parentMeth();
	}

	class A{

		public void parentMeth(){

		}
		}

		class B extends A{
		public void childMeth(){

		}

		}
}
