package Introduction;

import java.util.Scanner;

public class JavaProgramtoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		// nextInt() reads the next integer from the keyboard
		int number =reader.nextInt();
		//println() prints the following line to the output screen
	       
		System.out.println(number);
		reader.close();
				
	}

}
