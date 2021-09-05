package Example100;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float temp;
		
		Scanner sc= new Scanner(System.in);
		
		temp =sc.nextFloat();
		
		temp =((temp-32)*5)/9;
		
		System.out.println("Tempreture in celcius: "+temp);
		
		sc.close();
	}

}
