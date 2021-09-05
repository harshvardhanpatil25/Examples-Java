package Tricky_Naveen;


/**
 * Will Static block be executed with final variable?
 * @author Harsh
 *Answer is No
 */
public class WillStatic_block_be_executed_with_final_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Main.x);
	}

}
class Main{
	
	public static final int x =100;
	
	//when we decleare final it will directly call assigned value throgh common memory allocation  and skip main class
	static {
		System.out.println("main -class static block");
	}
	
}