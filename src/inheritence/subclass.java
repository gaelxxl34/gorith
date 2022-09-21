package inheritence;

public class subclass extends extendss
{
    private String nationality = "congolese";


    public static void main(String[] args)
    {
        subclass obj1 = new subclass();
        obj1.myName();
        System.out.println(obj1.name + " From " + obj1.nationality);
        System.out.println(obj1 instanceof subclass);


        // we can aslo call a method under the superclass by using the keyword *super*


    }

}
