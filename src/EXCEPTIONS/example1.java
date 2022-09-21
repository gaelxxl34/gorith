package EXCEPTIONS;

public class example1
{
    public static void main(String[] args)
    {
        try
        {
            int w = 0;
            int r = 4;
            int q = r/w;
            System.out.println("the answer is: " + q);
        }
        catch(Exception e)
        {
            System.out.println("possible error check please");
        }
        finally
        {
            System.out.println("try catch made a great job");
        }
        essai(80);
    }
public static void essai(int mark)
{
    switch (mark)
    {
        case 50: {
            throw new ArithmeticException("Access denied - You must have 50 in mark.");
        }
        default:
            System.out.println("Access granted");
            break;
    }
}
}


