package ALL_BASIC;


public class Methods
{
    String name = "moi";
    static  int Age = 22;
    int a = 40;
    public static void output()
    {
        System.out.println("the day is amazing");
    }
    public static void main(String[] args)
    {
        int a = 10;
        int b = 30;
        int c = a + b / 2;
        System.out.println(a);
        System.out.println("the answer is: " + c);
        Methods ob1 = new Methods();
        System.out.println(ob1.name);
        System.out.println(Age);


    }

}