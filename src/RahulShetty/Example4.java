package RahulShetty;

import java.util.ArrayList;

public class Example4 {

	//Compare same indexes of 2 different arrays and create another array for matching values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,5,7};
		int b[] = {6,4,3,7};//{4,7}
		int [] ab =new int[4]; 
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++)
		{
			if(a[i]== b[i])
			{
				//code to create another array
				//int [] ab =new int[4]; we dont know array size so we are using arraylist
				al.add(a[i]);
				
			}
		}
		Object[] c =al.toArray();
		
		for(Object ob:c)
		{
			System.out.println(ob);
		}
		
		
		
	}

}
