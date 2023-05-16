package collection.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> name = new HashMap<Integer,String>();

		name.put(1, "junaid");
		name.put( 2,"ali");
		name.put( 3,"haseeb");
		name.put( 4,"ali");
		name.put( 5,"ali");
		name.put( 6,"abdullah");
		name.put( 7,"junaid");
		name.put( 8,"haseeb");

		System.out.println("HashMap duplicate value List");

		ArrayList<String> newlist = new ArrayList<>(name.values()) ;
		
		for (String value : newlist) {
            System.out.println(value);
        }
		
		System.out.println("\nHashMap no duplicate value List");

		Set<String> list =new HashSet<>(name.values());
			
			for (String value : list) {
	            System.out.println(value);
	        }	
	
	}
	

}
