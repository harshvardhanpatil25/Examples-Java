package Introduction;

public class Selenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//can you solve below program 
		//I/p = 'selenium'
	  //O/p = 's*l*n*u* //
		
		String str="selenium";
		int i=0; 
		while(i<str.length()-1)
		{
		  char x = str.charAt(i+1);
		  System.out.println(x);
		str=str.replace(x,'*');
		i+=2;
		}
		System.out.println(str);
	}

}
