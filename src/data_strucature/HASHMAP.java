package data_strucature;

import java.util.HashMap;

public class HASHMAP
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> info = new HashMap<String, Integer>();
        info.put("age", 20);
        info.put("size", 100);
        info.put("class", 6);
        System.out.println(info.size());
        System.out.println(info.get("age"));

        // Print keys
        for (String i : info.keySet())
        {
            System.out.println(i);
        }

        // Print values
        for (int i : info.values())
        {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : info.keySet()) {
            System.out.println("key: " + i + " ||| value: " + info.get(i));
        }
    }
}
