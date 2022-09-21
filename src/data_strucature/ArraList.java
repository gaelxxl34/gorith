package data_strucature;

import java.util.ArrayList;
import java.util.Collections;

public class ArraList
{
    public static void main(String[] args) {
        //if we replace the <String> below with <integer> we create an arraylist of integers
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(1);
        cars.set(2,"rava");
        cars.size();

        System.out.println(cars.get(2));

        System.out.println(cars);
        //cars.clear();
        System.out.println("i have cleared");

        // the statemnet below enable to output element organized alphabetically
        Collections.sort(cars);

// we can also loop through the arralist using a for-each loop
//EXAMPLE:
        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}
