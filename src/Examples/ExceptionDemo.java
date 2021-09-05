package Examples;

public class ExceptionDemo {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
        int b =7;
        int c= 0;
        
        try {
        	
        	int k =b/c;
        	System.out.println(k);
        }
        catch(Exception e)
        {
        	System.out.println("got an exception");
        }
        finally
        {
        	System.out.println("delete cookies");
        }
	}

}
