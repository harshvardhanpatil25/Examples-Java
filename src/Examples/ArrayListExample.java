package Examples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("harsj");
		a.add("harsj");
		a.add(0,"student");
		System.out.println(a);
		/*a.remove(0);
		System.out.println(a);*/
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		
	}

}
