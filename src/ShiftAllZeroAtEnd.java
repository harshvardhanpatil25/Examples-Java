
public class ShiftAllZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int str[]= {2,5,6,0,26,5,6,0};
		
		int len =str.length;
		int count =0;
		for(int i=0;i<len;i++)
		{
			if(str[i]!=0)
			{
				str[count++]=str[i];
			}
		}
		while(count<len)
		{
			str[count++]=0;
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(str[i]);
		}
	}

}
