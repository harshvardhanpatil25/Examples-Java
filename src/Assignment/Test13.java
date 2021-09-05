package Assignment;
public class Test13
{

int var;
static int stc=7;
public static void main(String s[])
{
Test13 ob1 = new Test13();
ob1.var=9;
System.out.println("var of ob1 "+ob1.var);

Test13 ob2 = new Test13();
ob2.var=90;
System.out.println("var of ob2 "+ob2.var);

ob1.stc=ob1.stc+100;

System.out.println("ob1 "+ob1.stc);

System.out.println("ob2 "+ob2.stc);

}
}