package collection.com;

import java.util.Iterator;
import java.util.Stack;

public class Stackpratice {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		stack.push("Dog");
		stack.add("cat");
		stack.pop();

		System.out.println(stack);

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
