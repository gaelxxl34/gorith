package Polymorphism;

public class Main
{
    public static void main(String[] args)
    {

        // superclassST obj1 = new superclassST();
        // the object above will give an error because the superclass was abstract and can not have objects
        subclass1 objec1 = new subclass1();
        subclass2 object1 = new subclass2();

        //obj1.student_infos();
        //the student_infos(); method was abstract and can not be access using superclassST object


        //obj1.regNumber("21/746l");
        // the method above in superclassST can not be access through an object of the superclassST because this class has been abstracted
        System.out.println("......................................");
        objec1.student_infos();
        objec1.regNumber("43/8/lo-p");
        System.out.println("......................................");
        object1.student_infos();
        object1.regNumber("278/746/lfh-m");

    }
}
