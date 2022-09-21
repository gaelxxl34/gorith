package data_strucature;

import java.util.HashSet;

public class HASHSETS
{
    public static void main(String[] args)
    {

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(14);
        numbers.add(17);
        numbers.add(80);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 10; i <= 20; i++)
        {
            if(numbers.contains(i))
            {
                System.out.println(i + " was found in the set 😎😎😎😎🎇.");
            }
            else
            {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
    // contains() is a special method in Hashsets that enable to return if an element if find in the hashset or not
}
