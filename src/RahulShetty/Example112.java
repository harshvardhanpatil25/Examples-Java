package RahulShetty;

import java.util.ArrayList;

public class Example112 {
//Unique number in given arrays
	//. Eliminate duplicates and print Unique numbers in the array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,5,7,4,5,7,9,2};
		
		//4- 2,5-3,7-2,9-1,2-1,
		
		//Empty arraylist
		//Print unique from list-amazon
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;// refresh for every index
			if(!al.contains(a[i]))
					{
						al.add(a[i]);
						k++;
						for(int j=i+1;j<a.length;j++)
						{
							if(a[i]==a[j])
							{
								k++;
							}
					
					
						}
						//System.out.println(a[i]);
						//System.out.println(k);
						if(k==1)
							System.out.println(a[i]+"is unique number");
					}
		
				
		}
		
		
		
		
	}

}
