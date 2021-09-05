package Javatpoint;

class animall
{
	void eat() {System.out.println("animal eating");}
}

class Dogi extends animall
{
	void bark() {System.out.println("barking dog");}
}

class BabyDog extends Dogi
{
	void weep() {System.out.println("babydogweeping");}
}

public class TestInhertanceMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 BabyDog d = new BabyDog();
 
 d.bark();
 d.eat();
 d.weep();
	}

}
