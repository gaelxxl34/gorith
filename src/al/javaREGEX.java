package al;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class javaREGEX
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("vISIT", Pattern.CASE_INSENSITIVE);
        //method. The first parameter indicates which pattern is being searched for and
        // the second parameter has a flag to indicates that the search should be case-insensitive.

        Matcher matcher = pattern.matcher("Visit W3Schools!");
        // the method above enable to input a sentence so that we can search anything in it
        boolean matchFound = matcher.find();
        if(matchFound)
        {
            System.out.println("Match found");
        }
        else
        {
            System.out.println("Match not found");
        }
    }
}
