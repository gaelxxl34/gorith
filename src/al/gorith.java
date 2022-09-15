package al;

import java.util.Scanner;

public class gorith
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
    }
    public static int crisis()
    {
        int check = 21 - 10;
        return check;

    }
}
