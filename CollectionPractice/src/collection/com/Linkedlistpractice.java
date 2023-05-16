package collection.com;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistpractice {

	public static void main(String[] args) {

		LinkedList<String> list =new LinkedList<>();
		list.add("lion");
		list.add("Cat");
		list.add("Dog");
		//list.remove("lion");
		System.out.println(list);
		
		Iterator it= list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
