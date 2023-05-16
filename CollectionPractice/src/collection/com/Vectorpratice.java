package collection.com;

import java.util.Iterator;
import java.util.Vector;

public class Vectorpratice {

	public static void main(String[] args) {

		Vector<String> list= new Vector<>();
		list.add("lion");
		list.add("Cat");
		list.add("Dog");
	
		System.out.println(list);
		
		Iterator<String> it= list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
