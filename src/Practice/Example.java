package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Example {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer> (Arrays.asList(1,2,1,2,8,1,2,1,4,8,8,3,1,7,8,9,2,4,1,5));
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> listwithoudduplicate = new ArrayList<Integer>(linkedHashSet);
		System.out.println(listwithoudduplicate);
		
	}	

}
