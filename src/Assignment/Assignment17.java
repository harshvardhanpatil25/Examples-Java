package Assignment;

public class Assignment17 {
	int age;
	String name;

	Assignment17(){
	non_static_meth();
	static_meth();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment17 t1 = new Assignment17();
	}
	
	public void non_static_meth(){
		System.out.print("NM ");
		}

		public static void static_meth(){
		System.out.println("SM");
		}
		
}
