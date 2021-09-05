package RahulShetty;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PRINT Minimum 
		// 2 4 5
		// 3 4 7
		//1 2 9 //minimun number from entire matrix

		int abc [][]= {{2,8,5},{3,4,7},{1,2,9}};
		
		int min =abc[0][0];// assume that  [0] is smallest then traversing
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min =abc[i][j];
				}
			}
		}
		System.out.println(min);
	}

}
