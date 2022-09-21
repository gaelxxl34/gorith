package data_strucature;

import java.util.LinkedList;

public class Linkedlist
{
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
/* this toString() method transform all others datatype to a String
        Float myInt = 10.370f;
        String myString = myInt.toString();
        System.out.println(myString.length());
*/
    }
}
/* OTHERS PRECISE METHODS:

Method	Description	Try it
addFirst()	Adds an item to the beginning of the list.
addLast()	Add an item to the end of the list
removeFirst()	Remove an item from the beginning of the list.
removeLast()	Remove an item from the end of the list
getFirst()	Get the item at the beginning of the list
getLast()	Get the item at the end of the list
*
* */
