package collection.com;

import java.util.*;
import java.util.Map.Entry;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Apple");

        ArrayList<String> arrayList = new ArrayList<>(hashMap.values());

        // Print the ArrayList
        for (String value : arrayList) {
            System.out.println(value);
        }
    }
}
/* for (Entry<Integer, String> n : name.entrySet()) {

			System.out.println("values: " + n.getValue() ); */
