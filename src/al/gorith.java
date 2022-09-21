package al;

import java.util.Scanner;

public abstract class gorith
{
    public static void main(String[] args)
    {
        Scanner calcul = new Scanner(System.in);
        int b, n;
        System.out.println("enter the base");
        b= calcul.nextInt();
        System.out.println("enter power");
        n = calcul.nextInt();
        int pr = 1;

        for (int i = b; i  <= b; i++)
        {
            for(int x = 1; x <= n; x++)
            {

                pr = pr * b;

            }
        }
        System.out.println(pr);
        System.out.println("the crisis of check is: " + crisis());
        System.out.println(volcan("mikeno", "nyiragongo"));
    }
    public static int crisis()
    {
        int check = 21 - 10;
        return check;
    }
    public static String volcan (String first, String second)
    {
        return first + " another one is: " + second;

    }

    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method

}

