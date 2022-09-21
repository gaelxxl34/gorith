package Polymorphism;

//without the abstract keyword we shall have the normal inheritance using the extends keyword in subclass
//and methods and all the variable in this superclassST will be accessible through objects of the superclassST

public abstract class superclassST
    // when we use the keywork abstract it means the class must have subclass in order to complete some abstract method
    // and in this case we can only have a subclass object and never a super class
{
    protected int age = 20;
    protected String sex = "male";
    public abstract void student_infos();
   // public void regNumber(String reg)
    {
       // System.out.println(reg);
    }
}
