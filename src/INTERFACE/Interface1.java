package INTERFACE;

//An interface is a completely "abstract class" that is used to group related methods with empty bodies:
interface firstINT
{
    public void method1();
}
interface secondINT
{
    public void method2();
}
public class Interface1 implements firstINT, secondINT{
    @Override
    public void method1()
    {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("the addition answer is: " + c);
    }

    @Override
    public void method2()
    {
        String name = "gael";
        int age = 20;
        System.out.println("My Name is: " + name + " i am " + age);
    }

    public static void main(String[] args)
    {
        Interface1 obj1 = new Interface1();
        obj1.method1();
        obj1.method2();

    }
}
