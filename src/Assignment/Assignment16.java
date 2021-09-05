package Assignment;

public class Assignment16 {
	int age;
	String name;

	Assignment16(int age,String name){
	this.age=age;
	this.name=name;
	}
	public static void main(String[] args) {

		Assignment16 t1 = new Assignment16(17,"A");
		Assignment16 t2 = new Assignment16(13,"B");
		Assignment16 t3 = new Assignment16(14,"C");
		t3=t2;//
		t2=t1;//17
		t1=t3;//13
		System.out.print(t1.age);
		System.out.print(t2.age);
		System.out.println(t3.age);
	}

}
