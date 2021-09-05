package RahulShetty;

public class Example11 {
//Reverse without using predefined method or Palidrome string 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pallindrome("madam");
		
	}

	private static void pallindrome(String a) {
		// TODO Auto-generated method stub
	  String b="";

	  for(int i =a.length()-1;i>=0;i--)
	  {
		  b=b+a.charAt(i);
		  
	  }
	
	  if(a==b)
		  System.out.println("it is pallindrome");
	  else
		  System.out.println("it is not pallndrome");
		
		
	}

}
