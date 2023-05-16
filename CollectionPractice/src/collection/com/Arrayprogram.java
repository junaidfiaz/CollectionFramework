package collection.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Arrayprogram {

	public static void main(String[] args) {

		ArrayList<String> newlist= new ArrayList<>();
		newlist.add("lion");
		newlist.add("Cat");
		newlist.add("Dog");
		newlist.remove("lion");
		System.out.println(newlist);
		
		Iterator it= newlist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
/* System.out.println("HashMap new List");
		Collection<String> keys =  name.values(); // The set of keys in the map.

	    Iterator<String> keyIter = keys.iterator();

	    while (keyIter.hasNext()) {
	    	String key = keyIter.next();
	        String value = name.get(key);

	        System.out.println(key + "\t" + value);

	        String nextValue = name.get(key);

	        if (value.equals(nextValue)) {
	            name.remove(key);
	        }
	    }
	    System.out.println(name);}*/