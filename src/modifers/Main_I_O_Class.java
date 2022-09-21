package modifers;

public class Main_I_O_Class
{
    public static void main(String[] args)
    {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.s + myOuter.w);

        // in case we use static keyword in inner class the statement below will enable output:

        //OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        //System.out.println(myInner.y);
    }

}
