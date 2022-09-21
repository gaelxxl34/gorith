package data_strucature;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;

public class ITERATOR
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
        // It is called an "iterator"
        // because "iterating" is the technical term for looping.
        Iterator<String> it = cars.iterator();
        System.out.println(it.next());


        //To loop through a collection, use the hasNext() and next() methods of the Iterator:
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


        //


        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(14);
        numbers.add(17);
        numbers.add(80);
        Iterator<Integer> itt = numbers.iterator();
        while(itt.hasNext()) {
            Integer i = itt.next();
            if(i < 15) {
                itt.remove();
            }
        }
        System.out.println(numbers);
    }

}


