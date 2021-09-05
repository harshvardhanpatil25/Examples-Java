package Tricky_Naveen;

public class PrintHelloWorldwithoutusingSemi {

	//**
	//Print Hello World without using semi colon (;)//
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//way1
	if(System.out.printf("Hello World1"+"\n") ==null)
	{
		
	}

	
	//way 2
	
	if(System.out.append("Hello World2"+"\n") ==null)
	{
		
	}
	
	//way3
	if(System.out.append("Hello World3"+"\n").equals(null))
	{
		
	}
	
	//way4
	
	for(int i=0;i<1; System.out.println("Hello world4"+"\n"))
	{
		i++;
	}
	}

}
