package java_class;

import java.time.LocalDateTime;

public class part2
{
    public static void main(String[] args)
    {
        encapsulation myObj = new encapsulation();
        myObj.setFirstname("ONGORIKO"); // Set the value of the name variable to "John"
        System.out.println(myObj.getFisrtname());

        // this statement import a package to display date and time details
        LocalDateTime Obj = LocalDateTime.now();
        System.out.println(Obj);
    }

}
