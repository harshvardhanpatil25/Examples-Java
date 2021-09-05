package Javatpoint;

class animal
{
	void eat() {System.out.println("eating...");}
}

class Dog extends animal
{
	void bark() {System.out.println("barking...");}
}

public class TestInheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.eat();
		d.bark();
		
	}

}
