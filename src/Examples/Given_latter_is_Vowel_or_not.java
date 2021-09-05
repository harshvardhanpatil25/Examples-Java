package Examples;

import java.util.Scanner;

public class Given_latter_is_Vowel_or_not {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("enter character");
		Scanner scanner = new Scanner(System.in);
		
		char latter = scanner.next().charAt(0);
		scanner.close();
		//
	if(latter=='a'|| latter=='e'||latter=='i'|| latter=='o'|| latter=='u'||latter=='A'|| latter=='E'||latter=='I'|| latter=='O'|| latter=='U')
	{
		System.out.println("latter is vowel");
	}
	else
	{
		System.out.println("latter is not vowel");
	}
	}
		
			
		
		
	}

