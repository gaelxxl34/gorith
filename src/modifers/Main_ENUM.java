package modifers;

public class Main_ENUM
{
    enum activities {
        BIRTHDAY,
        NAME,
        NATIONALITY,
        RELIGION,
        PARENTS
    }

    public static void main(String[] args) {
        activities myVar = activities.BIRTHDAY;
        // We can also use an if statement or switch case with ENUM
        //EXAMPLE:
        switch (myVar)
        {
            case BIRTHDAY ->
                    {
                        System.out.println("17/12/2003");
                        break;
                    }
            case NAME ->
                    {
                        System.out.println("Gael");
                        break;
                    }
            case NATIONALITY ->
                    {
                        System.out.println("Congolese");
                        break;
                    }
            case RELIGION ->
                    {
                        System.out.println("Christian");
                        break;
                    }
            case PARENTS ->
                    {
                        System.out.println("Pere et Mere");
                        break;
                    }
            default -> System.out.println("i Love My Life");
        }
        // we can also loop through by using the value() method that will output all the element in the ENUM array
        //EXAMPLE:
        for (activities mVar : activities.values())
        {
            System.out.println(mVar);
        }

    }
}
